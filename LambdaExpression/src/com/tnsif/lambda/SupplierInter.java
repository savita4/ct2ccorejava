package com.tnsif.lambda;

import java.util.Random;
import java.util.function.Supplier;

T get();
public class SupplierInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> randomNumberSupplier = () -> new Random(10).nextDouble();
		  System.out.println(randomNumberSupplier.get());
		  System.out.println(randomNumberSupplier.get());

	}

}
