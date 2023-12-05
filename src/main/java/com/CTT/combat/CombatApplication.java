package com.CTT.combat;

import org.hibernate.dialect.aggregate.PostgreSQLAggregateSupport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class CombatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CombatApplication.class, args);
	}

}
