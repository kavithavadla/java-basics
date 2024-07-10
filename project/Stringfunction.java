package project;
public class Stringfunction {
public static void main(String[] args) {
		String a="manish kumar";	
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf('a'));
		String new1=	a.replace('m', 'a');
		System.out.println(new1);
		String new12=	a.replaceAll(" ", "");
		System.out.println(new12);
		String a1="manish kumar tiwari";
		System.out.println(a1.matches("(.*)i"));
		System.out.println(a1.matches("m(.*)"));
		System.out.println(a1.matches("(.*)k(.*)"));
		String a3="tom";
		System.out.println(a3.matches("..."));
		
		
		}
}