package my_package1;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int i = 8, j = 9;
		try
		{
			int k =i/j;
			if (k==0)
				throw new AnkushException("This is not possible");
			System.out.println(k);
		}
		catch(AnkushException e)
		{
			System.out.println("Error " + e.getMessage());
		}

	}

}
