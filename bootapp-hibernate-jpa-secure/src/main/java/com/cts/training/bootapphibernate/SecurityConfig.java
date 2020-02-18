package com.cts.training.bootapphibernate;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			
	
		auth.jdbcAuthentication().dataSource(dataSource);
		
		
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.cors() 
		.and()
			.csrf().disable() 
			.authorizeRequests()
				.antMatchers("/api/**").hasRole("USER")
				.antMatchers("/login").hasRole("USER") 
				
			.and()
				.httpBasic();
	}
}











