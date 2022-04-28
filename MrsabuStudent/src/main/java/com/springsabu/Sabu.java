package com.springsabu;

public class Sabu {
private int rollno;
private String name;
private float fees;
public Sabu(int rollno, String name, float fees) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.fees = fees;
}
public void Display() {
	System.out.println("rollno"+rollno);
	System.out.println("name"+name);
	System.out.println("fees"+fees);
	
}

}
