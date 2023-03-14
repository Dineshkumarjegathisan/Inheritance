package HierarchicalInheritance;

public class Student //parent class or Super class
{
	public void methodStudent () 
	{
		System.out.println("This is Student method");
	}
}
class Maths extends Student // child class of student and parent class of Science class 
{
	public void methodMaths() 
	{
		System.out.println("The method of Maths");
	}
}
class Science extends Student 
{
	public void methodScience()
	{
		System.out.println("The method of Science");
	}
}
class English extends Student 
{
	public void methodEnglish() 
	{
		System.out.println("The method of English");
	}
}
class Commerce extends Student 
{
	public void methodCommece() 
	{
		System.out.println("The method of Commerce");
	}

}
