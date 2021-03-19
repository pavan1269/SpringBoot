package com.example.Bank.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class BankSecurity extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		auth.inMemoryAuthentication()
		.withUser("pavan")
		.password("pavan")
		.roles("users");
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception
	{
		web.ignoring().antMatchers("/newuser")
		.and().ignoring().antMatchers("/update");
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
//	@Override
//	public void configure(HttpSecurity http) throws Exception
//	{
//		http.authorizeRequests()
//		.antMatchers("/allusers").hasRole("admin")
//		.and().formLogin();
//	}

}
