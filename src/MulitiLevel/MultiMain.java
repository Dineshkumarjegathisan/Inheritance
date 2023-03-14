package MulitiLevel;

public class MultiMain {

	public static void main(String[] args) 
	{
		Class_A a1 = new Class_A();//here we can access current class members only
		System.out.println(a1.a);
		System.out.println(a1.b);

		Class_B b1 = new Class_B();//here we can access super class_A members and same class member
		System.out.println("Iam child class A");
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
		
		Class_C c1 = new Class_C();//here we can access super class_B , super Class_A and same class member
		System.out.println("Iam child class of B ");
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1.e);
		System.out.println(c1.f);
			
	}
}
