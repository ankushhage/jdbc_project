package my_package;
class Parametrized_constructor 
	{
	  String languages;			// constructor accepting single value
	  Parametrized_constructor(String lang) 
	  {
	    System.out.println(languages + " Programming Language");
	   }

	  public static void main(String[] args) 
	  {											// call constructor by passing a single value
		  Parametrized_constructor obj1 = new Parametrized_constructor("Java");
		  Parametrized_constructor obj2 = new Parametrized_constructor("Python");
		  Parametrized_constructor obj3 = new Parametrized_constructor("C");
	  }
	}