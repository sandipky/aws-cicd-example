package com.techprimers.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AwsElasticBeanstalkExample2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(AwsElasticBeanstalkExample2Application.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AwsElasticBeanstalkExample2Application.class);
	}
}
