package inheritance;

public class SingleMain 
{
	 public static void main (String [] args) 
	 {
	
	SingleInheritance1 s1 = new SingleInheritance1();
	     
		System.out.println("Iam super class Datamember :"+s1.x);
		System.out.println("Iam super class Datamember :"+s1.y);
		
		System.out.println("After give the properties of parent class");
		
	SingleInheritance2 s2 = new SingleInheritance2();   
		System.out.println("Iam subclass Datamemeber"+s2.w);
		System.out.println("Iam subclass Datamemeber"+s2.z);
		System.out.println("Iam super class Datamember :"+s2.x);
		System.out.println("Iam super class Datamember :"+s2.y);
	
	 }
	
}
