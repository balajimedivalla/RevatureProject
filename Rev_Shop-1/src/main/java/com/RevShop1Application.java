package com;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "RepoPackages")
public class RevShop1Application {

	public static void main(String[] args) {
		SpringApplication.run(RevShop1Application.class, args);
	}

}
