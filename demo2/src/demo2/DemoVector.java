package demo2;

import java.util.Vector;
public class DemoVector {

	public static void main(String[] args) {
		/*Vector is like the dynamic array which can grow or shrink its size. Unlike array, we can store n-number of elements in it as there is no size limit. It is a part of Java Collection framework since Java 1.2. It is found in the java.util package and implements the List interface*/
		Vector<Integer> vec=new Vector<Integer>();
		System.out.println("Size of vector"+vec.capacity());
		vec.add(1);
		vec.add(12);
		vec.add(13);
		vec.add(4);
		vec.add(15);
		vec.add(11);
		vec.add(19);
		vec.add(10);
		vec.add(41);
		vec.add(17);
		vec.add(15);
		vec.add(21);
		vec.add(29);
		vec.add(10);
		vec.add(21);
		vec.add(15);
		vec.add(11);
		vec.add(19);
		vec.add(10);
		vec.add(41);
		vec.add(15);
		vec.add(11);
		vec.add(19);
		vec.add(10);
		vec.add(41);
		
		
			System.out.println(vec);
		System.out.println("Size of vector  "+vec.capacity());
		
		
	}
	}


