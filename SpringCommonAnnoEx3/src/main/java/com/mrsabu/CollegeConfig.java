package com.mrsabu;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //tells spring this is configuration class  //define here Componenet-scan
//@ComponentScan(basePackages="com.mrsabu")  //spring from this packages
public class CollegeConfig {

	//get principal object
		@Bean
		public Principal principalBean() {
			return new Principal();
		}
	//@Bean(name="colBean")  //to change bean id instead of method name
	@Bean
	public College collegeBean()  //collegeBean is the id of the Bean
	{
		College college=new College(principalBean()); //constructoe injection
		return college;
		//or return new College;
	}
	
	
}

