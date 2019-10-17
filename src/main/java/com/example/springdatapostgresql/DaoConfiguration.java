package com.example.springdatapostgresql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfiguration {
	
	@Bean
	public CodeCreation codeCreation() {
		return new CodeCreation();
	}

}
