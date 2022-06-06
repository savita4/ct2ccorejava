package demo2;
import java.util.Collections;
import java.util.ArrayList;

public class DemoArrayList {
public static void main(String args[])
{
	/* Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit*/
	 ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
     list.add("Mango");//Adding object in arraylist    
     list.add("Apple");    
     list.add("Banana");    
     list.add("Grapes");    
     //Printing the arraylist object   
     //System.out.println(list);  
     for(String fruit:list)    
    	    System.out.println(fruit);  
     list.remove(1);
   System.out.println(list); 
   list.add("Orange");
   System.out.println(list); 
     
}
}
