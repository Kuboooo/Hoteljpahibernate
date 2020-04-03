package com.example.JPAwHibernate.jpahibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.example.JPAwHibernate.jpahibernate.repositories")
@EntityScan(basePackages = "com.example.JPAwHibernate.jpahibernate.entity")
public class JpahibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpahibernateApplication.class, args);
	}

}
