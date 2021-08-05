package weekencap;
class Inheritance{
	double length=10;
	double breadth=20;
	double height=30;
}
class Square extends Inheritance{
	void area()
	{
		System.out.println("area of square :"+length*length);
	}
}
class Rectangle extends Inheritance{
	void area()
	{
		System.out.println("area of rectangle:"+length*breadth);
	}
}
class Trapezium extends Inheritance{
	void area()
	{
		System.out.println("arae of trapezium:"+(length*breadth)/2*height);
	}
}
public class Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sqr=new Square();
		Rectangle rec=new Rectangle();
		Trapezium tra=new Trapezium();
		sqr.area();
		rec.area();
		tra.area();

	}

}
