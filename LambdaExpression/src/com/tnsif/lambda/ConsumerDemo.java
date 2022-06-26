/* In-built Functional Interfaces
Java 8 provides some inbuilt functional interfaces that can be used in common programming scenarios. These are present in a package called java.util.Function. All the in-built functional interfaces are generic, that is the data type of their arguments/return values can be specified via generics
The Consumer interface can be used to operate on an input argument. Its abstract method accept has the following signature:  */
package com.tnsif.lambda;

import java.util.function.Consumer;

void accept(T t);

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> multiplier = num -> System.out.println(num*num);
		  multiplier.accept(10);
		  multiplier.accept(4);


	}

}
