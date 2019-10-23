package com.example.springdatapostgresql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.springdataDAO.group_creation.GroupCreationDAO;
import com.example.springdataDAO.group_creation.GroupCreationDAOImpl;


@Configuration
public class DaoConfiguration {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Value("$(spring.datasource.url)")
	private String URL;
	
	@Value("$(spring.datasource.driverClassName)")
	private String driverClassName;
	
	@Value("$(spring.datasource.username)")
	private String userName;
	
	@Value("$(spring.datasource.password)")
	private String pasword;
	
	@Bean
	GroupCreationDAO groupCreation() {
		return new GroupCreationDAOImpl(jdbcTemplate);
	}
	

}
