package project;
class Father // parent class
{
   void house()
	{
	System.out.println("Father has house");	
		}
	static void car()
	{
		System.out.println("Father has car");	
		}
}
public class SingleLevelInheritance_Child extends Father //child class 
{
	static void laptop()
	{
		System.out.println("Child has laptop");	
	}
	static void bike()
	{
		System.out.println("Child has bike");	
	}
public static void main(String[] args) {
	laptop();
	bike();
	car();
	SingleLevelInheritance_Child a1=new SingleLevelInheritance_Child(); 
	a1.house();  //object name should be always child class name
}}
