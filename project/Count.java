package project;
import java.util.Arrays;
public class Count {
public static void main(String[] args) 
{
		String input="KAVITHA 123 @#";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(input.length());
		int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
	for(int i=0;i<input.length();i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			boolean b3=Character.isWhitespace(c1[i]);
		
	if(b1==true)
	{
		count_of_alpha++;
		
		}
         System.out.println(count_of_alpha);
	
if(b2==true)
	{
		count_of_numeric++;
		
		}
System.out.println(count_of_numeric);

if(b3==true)
{
	count_of_space++;
	
	}
System.out.println(count_of_space);
System.out.println("Alphabets is "+count_of_alpha);
System.out.println("Numeric is "+count_of_numeric);
System.out.println("space is "+count_of_space);
		
	int count_of_specialcharacter=input.length()-(count_of_alpha+count_of_numeric+count_of_space);
	System.out.println("total no of special character are "+ count_of_specialcharacter);
}}}

