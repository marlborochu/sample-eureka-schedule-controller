package com.sample.job.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "com.sample.job.server" })
public class SampleServerApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SampleServerApp.class, args);
	}
	
}
