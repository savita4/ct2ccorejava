//4.	Lambda Expression using foreach
package com.tnsif.lambda;
import java.util.Set;

public class LambdaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> languages = Set.of("Java","Ruby","Python","C");
		languages.forEach(language -> System.out.println("language is:"+language));



	}

}
