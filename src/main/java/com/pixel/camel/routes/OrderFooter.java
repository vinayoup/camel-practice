package com.pixel.camel.routes;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import lombok.Getter;

@FixedLengthRecord()
@Getter
public class OrderFooter {

   @DataField(pos = 1, length = 1)
   private int recordType = 9;

   @DataField(pos = 2, length = 9, align = "R", paddingChar = '0')
   private int numberOfRecordsInTheFile;
}
