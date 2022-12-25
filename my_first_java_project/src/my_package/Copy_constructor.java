package my_package;

class Student
{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class Copy_constructor {
	public static void main(String args[])
	{
	Student s1 = new Student();
	s1.name = "Ankush";
	s1.age = 26;

	Student s2 = new Student();
	s2.printInfo();
	}
}