package com.villo.sortify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SortifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortifyApplication.class, args);
	}

}
