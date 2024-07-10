package project;

import java.util.Arrays;

public class Alphabet {
public static void main(String[] args)
{
		String input="50  cent@";
		char c1[]=input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<input.length();i++)
		{
			//boolean b1=Character.isAlphabetic(c1[i]);
			//System.out.println(b1);
			boolean b1=Character.isWhitespace(c1[i]);
			boolean b2=Character.isDigit(c1[i]);
			
			
		}
	}

}
