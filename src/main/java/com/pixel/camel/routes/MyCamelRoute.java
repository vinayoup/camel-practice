package com.pixel.camel.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


public class MyCamelRoute  {
    private Logger logger = LoggerFactory.getLogger(MyCamelRoute.class);
    CamelContext context = new DefaultCamelContext();

    public void myrout()throws Exception
    {
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("timer:first-timer").transform().constant("Time now:" + LocalDateTime.now()).
                        process(new SimpleProcessor())
                        .to("log:first-timer");
            }
        });
        context.start();
        context.getRoutes().forEach(r -> logger.info(r.toString()));
        context.stop();
    }


}
