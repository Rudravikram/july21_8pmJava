package com.methods;

public class Access_Modifiers {

	public static void main(String[] args) {
	 display();
	 
	 //Example myObj = new Example();
	 //myObj.show();
       Example.show(); // class name .methodname
	}

	
	public static void display() {
		System.out.println("displayed");
	}
	
}

class Example {
	public static void show() {
		System.out.println("show method");
		
		
		Access_Modifiers.display(); // classname .methodname
		
		}
	}


// - here the concepts discussed about the  public access modifiers