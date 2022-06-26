/* A functional interface is an interface that has one and only one abstract method. It can have multiple static and default methods. Functional interfaces were added by Java 8 to add functional programming support to Java. */

package com.tnsif.lambda;


@FunctionalInterface
public interface Printable 
{
public void print(String str);  //abstract method
default void format(String str) // default method
 {
     System.out.println("Formatting String str ...."+str);
 }	
 }



public class FunctionalInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Printable pn=str->System.out.println(" Abstract Sting");
pn.print(str);
pn.format("savita");
	}

}
