package oops.java;

public class Method_Overloading {
	int side;
	float radius;
	int length;
	int breadth;
	Method_Overloading(){
	}
	Method_Overloading(int s){
		side = s;
	}
	
	Method_Overloading(float r){
		radius = r;
	}
	
	Method_Overloading(int l , int b){
		length = l;
		breadth = b;
	}
	
	 public float areaOfCircle(){
		 return 3.14f*radius*radius;
	 }
	 
	 public int areaOfSquare(){
		 return side*side;
	 }
	 
	 public int areaOfRectangle(){
		 return length*breadth;
	 
	 }
	 public int area(int height , int base){
		 return (height*base)/2;
	 }
	 public float area(float diagonal1 , float diagonal2){
		 return (diagonal1 * diagonal2)/2;
	 }
	 
	 
	 public static void main(String[] args) {
		 Method_Overloading circle = new Method_Overloading(98.98f);
		 Method_Overloading square = new Method_Overloading(54);
		 Method_Overloading rectangle = new Method_Overloading(43,35);
		 Method_Overloading traingle = new Method_Overloading();
		 Method_Overloading rhombus = new Method_Overloading();
		System.out.println("Area of circle:"+ circle.areaOfCircle());
		System.out.println("Area of Square:"+ square.areaOfSquare());
		System.out.println("Area of rectangle:"+ rectangle.areaOfRectangle());
		System.out.println("Area of traingle:"+ traingle.area(43, 9));
		System.out.println("Area of rhombus:"+ rhombus.area(44.09f, 77.76f));
		
	}
}
