package com.pixel.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:files") .log("${body}")
        .unmarshal()
		.bindy(BindyType.Fixed, Order.class)		
        .process(new OrderProcessor())
                .log("${body}");
 
    }
}
