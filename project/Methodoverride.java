package project;
final class Random_class
{
void tube_light()//it is supressed//overridden
{

System.out.println("tubelight");	
}
}
public class Methodoverride extends Random_class
{
void torch_light()
{
	super.tube_light();
System.out.println("torchelight");	
}
	public static void main(String[] args) 
	{
		Methodoverride m1=new Methodoverride();
		m1.torch_light();

	}

}
