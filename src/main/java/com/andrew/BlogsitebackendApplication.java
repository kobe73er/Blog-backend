package com.andrew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.andrew")
@MapperScan("com.andrew.mapper")
public class BlogsitebackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(BlogsitebackendApplication.class, args);
	}
}
