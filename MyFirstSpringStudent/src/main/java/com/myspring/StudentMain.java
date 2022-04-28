package com.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
     ApplicationContext obj=new ClassPathXmlApplicationContext("Spring.xml");
     SpringStudent obj1=(SpringStudent) obj.getBean("Stu");
     obj1.display();
	}

}
