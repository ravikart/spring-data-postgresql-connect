package com.example.springdatapostgresql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springdata_service.group_creation.GroupCreationService;
import com.example.springdata_service.group_creation.GroupCreationServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	GroupCreationService groupCreationService() {
		return new GroupCreationServiceImpl();
	}

}
