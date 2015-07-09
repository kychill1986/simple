package com.yang.simple.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 包扫描，相当于xml中的<context:component-scan base-package="com.yang"/>
@ComponentScan(basePackages = { "com.yang" })
public class SimpleEntry {

	public static void main(String[] args) {
		SpringApplication.run(new Object[] { SimpleEntry.class }, args);
	}

}
