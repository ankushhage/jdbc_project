package my_package;

class Student2
{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student2(String name, int age)
	{
	this.name = name;
	this.age = age;
	}
}

public class Parametrized_constructor1 {
	public static void main(String args[])
	{
	Student2 s1 = new Student2("Ankush",25);
	s1.printInfo();
	}
}