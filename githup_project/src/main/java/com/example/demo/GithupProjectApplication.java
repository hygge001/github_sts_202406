package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithupProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithupProjectApplication.class, args);
		System.out.println("깃헙 연동 프로젝트 테스트");
	}

}
