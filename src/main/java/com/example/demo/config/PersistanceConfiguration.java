package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//these are configuration classes whcih is used for custom configurations
public class PersistanceConfiguration {

	@Bean
	public DataSource dataSource() {
		DataSourceBuilder builder = DataSourceBuilder.create();
		builder.url("jdbc:mysql://localhost:3306/conference_demo");
		builder.username("root");
		builder.password("pluralsight");
		System.out.print("Custom datasource bean has been initialied and set");
		return builder.build();
	}
}
