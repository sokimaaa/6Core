package com.core.platform.orderms.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.6core.platform.order-ms")
public class OrderingServiceStarter {

	public static void main(String[] args) {
		SpringApplication.run(OrderingServiceStarter.class, args);
	}

}
