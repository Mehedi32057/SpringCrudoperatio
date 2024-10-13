package com.dbbl.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class springconfigurationfile {
	@Bean
	public DriverManagerDataSource myDatasource() {

		DriverManagerDataSource mydataDataSource = new DriverManagerDataSource();
		mydataDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		mydataDataSource.setUrl("jdbc:mysql://localhost:3306/crudspring");
		mydataDataSource.setUsername("root");
		mydataDataSource.setPassword("root");

		return mydataDataSource;
	}

	@Bean
	public JdbcTemplate myjdbcTemplate() {

		JdbcTemplate myjdbcTemplate = new JdbcTemplate();
		myjdbcTemplate.setDataSource(myDatasource());
		return myjdbcTemplate;

	}

}