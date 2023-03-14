package HybridInheritance;

public class GrandFather 
{
	public void show() 
	{
		System.out.println("i am GrandFather");
	}
}
class Father extends GrandFather 
{
	public void show () 
	{
		System.out.println("i am Father");
		
	}
}
class Son extends Father 
{
	public void show ()
	{
		System.out.println("i am son ");
	}
}
class Daughter extends Father
{
	public void show () 
	{
		System.out.println("i am daughter ");
	}

}