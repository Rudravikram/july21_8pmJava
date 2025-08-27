package com.inheritance;

public class Single_Level {

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		v.display();
		

		Bike b = new Bike();
		b.tyres = 2;
		b.model = "Duke";
		b.show();
		b.display();
		
		
	     
	}

}
class Vehicle {
	int tyres = 4;
	String model;

	public void display() {
		System.out.println("The model of the vehicle from parent class is " + model + " " + tyres);
	}
}
class Bike extends Vehicle{
	
	int year = 2015;
	
	public void show() {
		System.out.println("The child class value " + year + " " + tyres+ " " + model);
		System.out.println();
	}
}

// 19/08/2025