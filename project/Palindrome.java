package project;
public class Palindrome {
public static void main(String[] args) 
{
		String input="MADAM";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;}
			System.out.println(output);
			if(input.equals(output))
			{
				System.out.println("MADAM IS PALINDROME");
			}
		else
		{
			System.out.println("MADAM IS NOT PALINDROME");	
		}
	}

}
