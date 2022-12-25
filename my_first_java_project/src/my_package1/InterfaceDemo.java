package my_package1;

// solution for Problem of multiple inheritance in interface
interface Demo
{
	void abc();
	default void show()
	{
		System.out.println("in Demo show");
	}
	
}
interface MyDemo
{
	default void show()
	{
		System.out.println("in MyDemo show");
	}
}

class DemoImp implements Demo, MyDemo
{
	public void abc()
	{
		System.out.println("in abc");
	}
	
	@Override
	public void show() 
	{
		MyDemo.super.show();						//With super you can call to MyDemo to avoid ambiguity/multiple inheritance issue
//		System.out.println("in DemoImp show");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) 
	{
		Demo obj = new DemoImp();
		obj.show();
		obj.abc();
	}

}
