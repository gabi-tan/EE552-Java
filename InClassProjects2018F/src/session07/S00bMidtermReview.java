public class S00bMidtermReview {
	public static void main(String[] args) {
		A a1 = new A(); // instantiating (default constructor)
    Shape s; //		illegal: s = new Shape(2,3);
		s = new Square(10);
		System.out.println(s.area());
		Shape3d shape = new Cylinder(10.5, 20);
	}
}

class A {
	//	default constructor: public A() {}

}

abstract class Shape {
	private int x,y;
	public Shape(int x, int y) {
		this.x = x; this.y = y;
	}
	public abstract double area();
}

class Square extends Shape {
	private int s;
	public Square(int x, int y, int s) {
		super(x,y);
		this.s = s;
	}
  @override
	public double area() { return s*s; }
}

interface Shape3d {
	public double volume();
	public void draw(Graphics g);
}

class Cylinder implements Shape3d {
	public Cylinder(double r, double h) {}
	public double volume() { return Math.PI * r * r * h; }
	public void draw(Graphics g) {
		//???
	}

}


