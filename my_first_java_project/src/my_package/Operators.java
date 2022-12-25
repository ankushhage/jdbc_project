package my_package;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		int b=20;
		System.out.println("The output of sum of a and b is: " +(a+b));			//Addition
		System.out.println("The output of multiply of a and b is: " +(a*b));	//Multiplication
		System.out.println("The output of division of a and b is: " +(a/b));	//Quetient or division
		System.out.println("The output of remender from a and b is: " +(a%b));	//Remender
		
		System.out.println('\n'); // Spacing		
		
		System.out.println(a!=b); //True
		System.out.println(a==b); //False
		System.out.println(a>b); //True
		System.out.println(a<b); //False
		System.out.println(a>=b); //True
		System.out.println(a<=b); //False
		
		System.out.println('\n'); // Spacing 
		
		//Logical Operators && || |
		//Works between two boolean
		boolean x=true;
		boolean y=true;
		System.out.println(x && y); //True
		System.out.println(y || y); //True
		System.out.println(!x); //False
	}

}
