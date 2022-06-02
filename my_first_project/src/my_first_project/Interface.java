package my_first_project;

interface A1{
	int i=10;//variables need to be initialised
	 public abstract void display();
}

interface B1{
	void display1();
	
}

public class Interface implements A1,B1 {
	public void display()
	{
		System.out.println("display A");
	}
	public void display1()
	{
		System.out.println("display B");
	}
public static void main(String args[])
{
	Interface obj=new Interface();//interface obj_name=new Class_name
	obj.display();
	obj.display1();
	System.out.println(obj.i);
}
}
