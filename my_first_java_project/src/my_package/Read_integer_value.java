package my_package;

import java.util.Scanner;

public class Read_integer_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the integer: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		System.out.println("Entered integer value: " +num);
	}

}
