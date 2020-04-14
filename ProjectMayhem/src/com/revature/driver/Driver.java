package com.revature.driver;

import com.revature.beans.*;

public class Driver {
	//single comment
	/*
	 * multi
	 * line
	 * Comment
	 */
	/*
	 * Why Java?
	 * "WORA" principal
	 *      "write once, run anywhere"
	 * OOP
	 * Widespread use
	 * Great Documentationa!
	 * Oracle
	 *  Sun Microsystems used to own it...
	 * version 1.8 "Java 8"
	 * 
	 * 3 common acronyms - JDK, JRE, JVM
	 *  JVM- Java Virtual Machine
	 *       Converts compiled Java code into machine code that your processor can understand
	 *       Provides portability
	 *  JRE- Java Runtime Environment
	 *      JVM + Libraries!
	 *      Everything that we need to RUN java
	 *  JDK- Java Development Kit
	 *      Contains JVM + JRE
	 *      Compiler, etc...
	 *      Everything we need to WRITE java
	 * Object Oriented Programming
	 *  Java is ^!
	 *  unit of programmability is the object
	 *  Objects have states and behavior
	 *  States- aka fields, attributes, variables, etc.
	 *  Behaviors- methods
	 *  Classes- blueprint or templates of an object
	 *  
	 */
	public static void main(String[] args){
		/*public- access modifier, everything can access it
		 * static- do not need to instantiate to use/belongs to the class
		 * void- doesn't return
		 * String[] args- parameter(s) used for this method
		 * 
		 */
		//System.out.print("Go Team");
		System.out.println("Roll Tide");
		human h = new human();
		System.out.println(h);
		h.setName("Matt");
		h.setAge(34);
		h.setWeight(270);
		System.out.println(h.getName());
		
	}
}
