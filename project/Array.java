package project;
import java.util.Arrays;
public class Array {
public static void main(String[] args)
{
		int input[]=new int[3];
		input[0]=88;
		input[1]=45;
		input[2]=22;
		int output[]=new int[3];
		for(int i=0;i<=2;i++)
		{
			output[i]=input[i];
		}
		
			System.out.println(Arrays.toString(input));
			System.out.println(Arrays.toString(output));
			
		}
	}


