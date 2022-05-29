package my_first_project;

class Parent
{
	public void add(int  x,int y)
	{
		System.out.println("sum is "+(x+y));
	}
}
public class DemoInh extends Parent {


	public static void main(String args[])
	{
		 DemoInh obj=new DemoInh();
		 obj.add(10,20);
	}
}
