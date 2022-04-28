package com.mrsabu;

//Completely removed xml file



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Main class
public class Main {

	// Main driver method
	public static void main(String[] args)
	{

		
		//ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
      
		// a object of College class type
		College college = context.getBean("collegeBean", College.class);
     System.out.println("College object is created "+college);
		college.test();
	}
}