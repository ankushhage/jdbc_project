package my_package;

class Student3
{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
Student3(Student3 s2)
	{
	this.name = s2.name;
	this.age = s2.age;
	}
Student3()
	{
	}
}

public class Copy_constructor1 {
	public static void main(String args[])
	{
	Student3 s1 = new Student3();
	s1.name = "Ankush";
	s1.age = 25;
	
	Student3 s2 = new Student3(s1);
	s2.printInfo();
	}
}