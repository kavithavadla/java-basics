package project;
import java.util.Arrays;
import java.util.Scanner;
public class Boolean_datatype {
public static void main(String[] args)
{
		
		boolean[] booleanArray=new boolean[2];
		Scanner s1=new Scanner(System.in);
		booleanArray[0]=s1.nextBoolean();
		booleanArray[1]=s1.nextBoolean();
	System.out.println(Arrays.toString(booleanArray));
	}
}
