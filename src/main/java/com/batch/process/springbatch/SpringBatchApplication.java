package com.batch.process.springbatch;

// This example are available
// in: https://spring.io/guides/gs/batch-processing

// all Item readers and Item writers available
// in : https://docs.spring.io/spring-batch/reference/appendix.html

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchApplication.class, args);
    }

}
