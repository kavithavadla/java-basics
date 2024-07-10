package project;
public class Child1 extends Headmaster
{
      static void Toy1()
{
System.out.println("Child1 Want Toy car");
}
      public static void main(String[] args)
      {
    	  Toy1();
    	  Child2.Toy2();
    	  Child3.Toy3();
    	  Child4.Toy4();
    	  Child5.Toy5();
    	  Headmaster.Head_Master();
      }
}
class Child2 extends Headmaster
{
     static void Toy2()
	 {
		 System.out.println("Child2 Want Toy van");
	 }
}
class Child3 extends Headmaster
{
	static void Toy3()
	 {
		 System.out.println("Child3 Want Toy bus");
	 }
}
class Child4 extends Headmaster
{
	static void Toy4()
	 {
		 System.out.println("Child4 Want Toy truck");
	 }
}
class Child5 extends Headmaster
{
	static void Toy5()
	 {
		 System.out.println("Child5 Want Toy lorry");
	 }}


