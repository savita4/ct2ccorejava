//2.	 lambda expression that accepts two parameters and returns a value
package com.tnsif.lambda;

@FunctionalInterface
public interface Operator1 {
 public int operate(int num1,int num2);
}

public class OperatorDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator1 op = (num1,num2) -> num1+num2;
		int sum = op.operate(10,20);
		System.out.println("sum:"+sum);

	}

}
