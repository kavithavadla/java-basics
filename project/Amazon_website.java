package project; // Multilevel inheritance static methods
class Alphabet_Auth //Grandfather
{
	static void auth1()
	{
		System.out.println("1");
	}
	}
class Amz_Google_Auth extends Alphabet_Auth //Father
{
	static void auth2()
{
	System.out.println("2");
}}

public class Amazon_website extends Amz_Google_Auth //child class 
{
	static void auth3()
	{
		System.out.println("3");}

	public static void main(String[] args) {
		auth3();
		auth2();
		auth1();  } }
