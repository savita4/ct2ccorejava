package my_first_project;

class OuterDemo{
	public void show()
	{
		System.out.println("Outer");
		
	}
	public class DemoInner{
		public void display()
		{
			System.out.println("DemoInner");
		}
	}
}

public class Inner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterDemo Out=new OuterDemo();
		Out.show();
		OuterDemo.DemoInner In=Out.new DemoInner();//to acces the inner class use the syntax as outerclass.innerclass object=outerclassobject.new innerclass()
		
In.display();
	}

}
