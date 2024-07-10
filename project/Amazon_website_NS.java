package project;  // Multilevel inheritance Nonstatic methods
class Alphabet_Auth1 //Grandfather
{
	 void auth1()
	{
		System.out.println("1");
	}
	}
class Amz_Google_Auth1 extends Alphabet_Auth1 //Father
{
	 void auth2()
{
	System.out.println("2");
}}

public class Amazon_website_NS extends Amz_Google_Auth1 //Child 
{
	 void auth3()
	{
		System.out.println("3");}

	public static void main(String[] args) {
		Amazon_website_NS a1=new Amazon_website_NS();
		a1.auth3();
		a1.auth2();
		a1.auth1();      
		}}
