package com.mrsabu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Main class
public class MainApp {

	// Main driver method
	public static void main(String[] args)
	{

		
		//ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(Myconfig.class);
        
		// a object of College class type
		College college = context.getBean("collegeBean", College.class);
       System.out.println("College object is created "+college);
		college.test();
	}
}
