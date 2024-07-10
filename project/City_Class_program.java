package project;
public class City_Class_program {
	City_Class_program(int age)
	{
		System.out.println(age);
	}
	City_Class_program(double weight)
	{	
		this(53);
		System.out.println(weight);
	}
	City_Class_program(String name)
	{	
		this(19.09);
       System.out.println(name);
	}

	public static void main(String[] args)
	{
		new City_Class_program("Ram");
//		new City_Class_program(90.87);
//		new City_Class_program(21);
	}	
	}
