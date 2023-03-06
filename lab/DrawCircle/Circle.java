package com.cognizant.shapes; 	//declaring the package shapes


public class Circle {		//defining the class 
	
	@SuppressWarnings("unused")
	private static float radius; 	//as per the question private float variable with name radius
	protected float pi;		//package level access variable pi
	
	public Circle(){		//default constructor
		super();
		Circle.radius=1.5f;				//initializing the value of radius by 1..5f
	}
	protected Circle(float radius){		//package level access to parameterized constructor
		this(radius,3.5f);				//pi value by 3.5f
	}
	
	@SuppressWarnings("static-access")
	private Circle(float radius,float pi){	//class level access to the parameterized circle constructor
		super();
		this.pi=pi;				// Initializes the radius with the value passed in.
		this.radius=radius;		// Initializes the radius with the value passed in.
	}
	
	double calculateCircleArea (float radius) {			//method to calculate the area of circle
		double result;					//defining the result variable
		result=(pi*radius*radius);		//formula to calculate the area and 
		return result; 					//will return the value as area of circle
		
	}
	
	double calculateCircumference(float radius) {		//method to calculate the circumference of circle
		
		double result1;						//defining the result to store the final circumference value
		result1=(2 * pi * radius);			//formula to calculate the circumference of circle
		return result1;						//result will be return here
		
	}
	public static void main(String args[]) {
		Circle c=new Circle(1.5f);						//calling the constructor and creating the object
		double area =c.calculateCircleArea(1.5f);		//to calculate the area called the area method
		System.out.println("The Area of Circle is :" +area);	//will display the area 
		double Circumference=c.calculateCircumference(1.5f);				//for circumference 
		System.out.println("The Circumference of Circle is :" +Circumference);			//to display the circumference
	}

}