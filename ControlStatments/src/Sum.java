
public class Sum {
	 public int addNumbers(int a, int b) {
		    int sum = a + b;
		    // return value
		    return sum;
		  }

		  public static void main(String[] args) {
		    
		    int num1 = 25;
		    int num2 = 15;

		    // create an object of Main
		    Sum obj = new Sum();
		    // calling method
		    int result = obj.addNumbers(num1, num2);
		    System.out.println("Sum is: " + result);
		  }

}
