package pkgMain;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	public Triangle(){
		this.side1= 1.0;
		this.side2=2.0;
		this.side3=3.0;		
	}
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getArea(){
		double s=(side1+side2+side3)/2;
		return Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}
	public String toString(){
		return "The area of this triangle is "+getArea()+" and the perimeter is "+getPerimeter();
	}
}
