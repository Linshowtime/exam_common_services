package com.scau.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@MapperScan(basePackages="com.scau.common.mapper")
@ComponentScan(value = {"com.scau.common"})
public class ZyCommonApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZyCommonApplication.class, args);
	}
}
