package com.mars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mars.*")
public class MarsTelecomCodingAssignmentTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsTelecomCodingAssignmentTestApplication.class, args);
	}

}
