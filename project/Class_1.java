package project;
abstract class class_2
{
	abstract void add();
	abstract void substract();
}
public class Class_1 extends class_2
{
void login_logic()
{
	System.out.println("login");
}static void logout_logic()
{
	System.out.println("logout");
}public static void main(String[] args)
	{
		logout_logic();
		Class_1 m1=new Class_1();
		m1.login_logic();
		m1.substract();
		m1.add();}
	@Override
	void add() {
		System.out.println("addition");
	}
	@Override
	void substract() {
		System.out.println("subtraction");
		
}}
