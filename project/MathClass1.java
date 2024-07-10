package project;
public class MathClass1 {
	static void area()
	{
	final double r=Math.random();
	double area=Math.PI*r*r;
	System.out.println(area);
	}
	static void circumference()
	{
		double r=Math.random();
		double circumference=2*Math.PI*r;
		System.out.println(circumference);
		
	}
public static void main(String[] args)
{
	area();
	circumference();
	}

}
