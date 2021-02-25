package com.concourse.demo.ConcourseDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ConcourseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcourseDemoApplication.class, args);
	}
}
