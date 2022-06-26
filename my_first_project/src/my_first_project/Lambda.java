package my_first_project;
import java.util.*;


interface lambda
{
	public void add(int a,int b);
	
	
}

public class Lambda {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		lambda obj=(int a,int b)->System.out.println(a+b);
		obj.add(3, 6);

	}

}
