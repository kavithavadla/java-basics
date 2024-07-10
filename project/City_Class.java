package project;//super calling parameterized
class State_Class
{
	State_Class(int a)
	{
		System.err.println("state class");
	}
}
public class City_Class extends State_Class
{
	City_Class()
	{
		super(100);//both implicitly,explicitly
		System.out.println("city class");
	}

	public static void main(String[] args) 
	{
		new City_Class();

	}}

	
	
	
	
	
	
	
	

// super calling statement non parameterized
/*class State_Class
{
	State_Class()
	{
		System.err.println("state class");
	}
}
public class City_Class extends State_Class
{
	City_Class()
	{
		super();
		System.out.println("city class");
	}

	public static void main(String[] args) 
	{
		new City_Class();

	}

}*/
