package demo2;

public class DemoWrapper {
	
public static void main(String args[])
{
	int i=20;
	double d=30.67;
	//Boxing
	//Integer job=Integer(i);
	
 Integer job=i;//autoboxing:-converting primitive type to object class
 System.out.println("This is autoboxing"+job);
 //unboxing:-converting object type to primtive type
 //int j=job.intValue();
 int j=job;
 System.out.println("this is unboxing"+j);
 
 
 
 
}
}
