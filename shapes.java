class Shape{
	double area;
	double parameter;
	float length=2,breadth=2;
	int noOfSides=4;
	void area(){
		area=1/2*(length*breadth);
		}
	void parameter() {
		parameter = noOfSides*length;
	}

}
class Circle extends Shape{
	float r=2;
	void area() {
		area=3.14*r*r;
		System.out.println("i m area of the circle");
	}
	void parameter() {
		parameter=(2*3.14)*r;
		System.out.println("i m the pArameter of the circle");
	}
	void Details() {
		System.out.println("its a circle");
	}
}
class Square extends Shape{
	float side=2;
	void area() {
		area=side*side;
		System.out.println("i m the area of the square");
	}
	void parameter() {
		parameter=4*side;
		System.out.println("i m the parameter of the square");
	}
}
class Triangle extends Shape{
	void area() {
		area=(1/2)*(length*breadth);
		System.out.println("i m the area of the Triangle");
	}
	void parameter() {
		parameter=3*noOfSides;
		System.out.println("i m the parameter of the triangle");
	}
	void Details() {
		System.out.println("its a Triangle");
	}
}
class ShapesCalls{
	void callMe(Shape shape){
		shape.area();
		shape.parameter();
		System.out.println("************************************");
		if(shape instanceof Circle){
			Circle ca = (Circle) shape ; // Downcasting
			ca.Details();
		}
		else
		if(shape instanceof Square){
			Square fa = (Square) shape;
			fa.Details();
			}
		}
public class shapes {

	public static void main(String[] args) {
		
		ShapesCalls ac = new ShapesCalls();
		ac.callMe(new Circle());  
		ac.callMe(new Square());
		ac.callMe(new Triangle()); }
}