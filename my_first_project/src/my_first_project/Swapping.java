package my_first_project;

public class Swapping {

	public static void main(String[] args)
	{
	int first = 5, second = 10;
	 System.out.println("--Before swap--");
	 System.out.println("First number = " + first);
	 System.out.println("Second number = " + second);
	 // Value of first is assigned to temporary
	 int temporary = first;
	 // Value of second is assigned to first
	 first = second;
	 // Value of temporary (which contains the initial
	//value of first) is assigned to second
	 second = temporary;
	 System.out.println("--After swap--");
	 System.out.println("First number = " + first);
	 System.out.println("Second number = " + second);
	}
	
}
