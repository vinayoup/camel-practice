package com.pixel.camel.routes;

import java.util.Date;

import org.apache.camel.dataformat.bindy.annotation.DataField;
import org.apache.camel.dataformat.bindy.annotation.FixedLengthRecord;

import lombok.Getter;

@FixedLengthRecord()
@Getter

public class OrderHeader{
  @DataField(pos = 1, length = 1)
  private int recordType = 1;

  @DataField(pos = 2, length = 10, pattern = "dd-MM-yyyy")
  private Date recordDate;
}