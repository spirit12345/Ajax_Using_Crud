package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableJpaRepositories("com")
@EntityScan("com")
public class Test {
public static void main(String[] args) {
	System.out.println("In main ()");
	SpringApplication.run(Test.class);
	System.out.println("showing Main end after successfull pulling from github");
}
}
