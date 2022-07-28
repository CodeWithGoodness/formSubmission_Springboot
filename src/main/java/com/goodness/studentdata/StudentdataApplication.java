package com.goodness.studentdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.goodness.studentdata.StudentdataApplication;
@ComponentScan
@SpringBootApplication

public class StudentdataApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StudentdataApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentdataApplication.class, args);
	}
	
}