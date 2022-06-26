//1.	lambda expression that accepts a single parameter and does not return any value
package com.tnsif.lambda;


@FunctionalInterface
public interface Operator {
 public void operate(int num);
}

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operator op = num -> System.out.println("Increasing num by 2:"+(num+2));
		  op.operate(10);


	}

}
