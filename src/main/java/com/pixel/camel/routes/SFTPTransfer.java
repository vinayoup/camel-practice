package com.pixel.camel.routes;

import org.apache.camel.builder.RouteBuilder;

public class SFTPTransfer extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // this is for download
      /*  from("sftp://ubuntu@pixeltechlab.com:22/home/ubuntu/camel-input5?password=Pixel@123").
                log("${body}")
                .to("file:files/output");

       */
        // this is for upload
        /*
        from("file:files/output").
                log("${body}")
                //.to("sftp://ubunt@pixeltechlab.com:22/home/ubuntu/camel-output2?password=Pixel@123");
                .to("sftp://ubuntu@pixeltechlab.com:22/home/ubuntu/camel-input5?password=Pixel@123");

         */
        //sftp to sftp
        from("sftp://ubuntu@pixeltechlab.com:22/home/ubuntu/camel-input5?password=Pixel@123").
                log("${body}")
                //.to("sftp://ubunt@pixeltechlab.com:22/home/ubuntu/camel-output2?password=Pixel@123");
                .to("sftp://ubuntu@pixeltechlab.com:22/home/ubuntu/camel-output?password=Pixel@123");


    }

}
