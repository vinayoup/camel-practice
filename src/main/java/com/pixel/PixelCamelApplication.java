package com.pixel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PixelCamelApplication {
	private static Logger logger = LoggerFactory.getLogger(PixelCamelApplication.class);
	public static void main(String[] args) throws Exception{
		SpringApplication.run(PixelCamelApplication.class, args);
/*
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("timer:first-timer").transform().constant("This is Camel route under camelcontext1")
						.to("log:first-timer");

			}
		});
		//context.start();
		Thread.sleep(10000);
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("timer:first-timer").transform().constant("This is Camel route under camelcontext2")
						.to("log:first-timer");

			}
		});
	}

	@Bean
	public CamelContext getCamelContextBean() throws Exception
	{
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("timer:first-timer").transform().constant("This is Camel route under camelcontext1")
						.to("log:first-timer");
				from("timer:first-timer").transform().constant("This is Camel route under camelcontext2")
						.to("log:first-timer");
				from("timer:first-timer").transform().constant("This is Camel route under camelcontext3")
						.to("log:first-timer");

			}
		});
		context.start();
		System.out.println("List of routs:-->"+context.getRoutes());
		context.stop();
		return context;
		*/
	}
	

}
