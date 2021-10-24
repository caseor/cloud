package org.casey.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.casey.web"})
@MapperScan(basePackages	= {"org.casey.web.mapper"})
public class WebApplication {

  @Autowired
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
