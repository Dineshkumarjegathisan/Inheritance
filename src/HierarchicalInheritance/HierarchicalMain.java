package HierarchicalInheritance;

public class HierarchicalMain 
{
		public static void main (String [] args ) 
		{
			Commerce c1 = new Commerce();//we can access super class method Student and same class method(Commerce)
			c1.methodCommece();
			c1.methodStudent();
			Maths m1 = new Maths();
			m1.methodMaths();
			m1.methodStudent();
			Science s1 = new Science();
			s1.methodScience();
			s1.methodStudent();
			English e1 = new English();
			e1.methodEnglish();
			e1.methodStudent();
		}
}
