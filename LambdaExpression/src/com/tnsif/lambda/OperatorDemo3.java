//3.	Lambda expressions allow providing different implementations for the same functional interface method at runtime.

package com.tnsif.lambda;

public interface Operator2
{
	public int operate(int num1,int num2);
}
public class OperatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operator2 op = (num1,num2) -> num1+num2;
		  int sum = op.operate(10,20);
		  System.out.println("sum:"+sum);
		 
		  Operator2 op2 = (num1,num2) -> num1-num2;
		  int difference = op2.operate(25, 10);
		  System.out.println("Difference:"+difference);


	}

}
