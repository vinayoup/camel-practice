package com.pixel.camel.routes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleProcessor implements Processor {
    private Logger logger = LoggerFactory.getLogger(SimpleProcessor.class);
    @Override
    public void process(Exchange exchange) throws Exception {
      logger.info("Info logs for processor:"+exchange.getMessage().getBody());
    }
}
