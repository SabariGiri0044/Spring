package com.mrsabu;
//not configure bean in spring.xml
//configure in class, just write a @Componenet



public class College {
	private Principal principal; //Constructor DI

public College(Principal principal) {
		
		this.principal = principal;
	}

public void test() {
	principal.principalInfo();
	  System.out.println("Testing class method");
}
}
