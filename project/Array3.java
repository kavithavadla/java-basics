package project;
import java.util.Arrays;
import java.util.Scanner;
public class Array3 {
public static void main(String[] args) 
{
		double values[]=new double[3];
		Scanner s1=new Scanner(System.in);
		values[0]=s1.nextDouble();
		values[1]=s1.nextDouble();
		values[2]=s1.nextDouble();
		System.out.println(Arrays.toString(values));
	}}
