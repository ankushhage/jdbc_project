package my_package;

class Student1
{
	String name;
	int age;
	
	public void printInfo()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	Student1()
	{
		System.out.println("Constructor Called and details printed as");
	}
}

public class Default_constructor1 {
	public static void main(String args[])
	{
	Student1 s1 = new Student1();
	s1.name = "Ankush";
	s1.age = 26;
	s1.printInfo();
	}
}