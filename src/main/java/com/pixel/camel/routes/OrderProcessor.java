package com.pixel.camel.routes;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.dataformat.bindy.fixed.BindyFixedLengthDataFormat;

public class OrderProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Map<String, Object> receivedHeaderMap = (Map<String, Object>) exchange.getIn()
				.getHeader(BindyFixedLengthDataFormat.CAMEL_BINDY_FIXED_LENGTH_HEADER);

		Map<String, Object> receivedFooterMap = (Map<String, Object>) exchange.getIn()
				.getHeader(BindyFixedLengthDataFormat.CAMEL_BINDY_FIXED_LENGTH_FOOTER);

		OrderHeader receivedHeader = (OrderHeader) receivedHeaderMap.get(OrderHeader.class.getName());
		OrderFooter receivedFooter = (OrderFooter) receivedFooterMap.get(OrderFooter.class.getName());
		
		System.out.println(receivedHeader.getRecordType()+"/"+receivedFooter.getNumberOfRecordsInTheFile());

		List<Order> data = (List<Order>)exchange.getIn().getBody(List.class);

		for (Order order : data) {
			System.out.println(order.getFirstName());
			System.out.println(order.getLastName());
		}

	}

}
