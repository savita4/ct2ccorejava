package my_first_project;

 class Final{//final class cannoted be inherited
	public void show()//final methods cannot be overriden
	{
		System.out.println("With final");
	}
}

public class FinalDEmo extends Final {
final public int i=10;//final variable cannot the reassigned,they are constant
public void show()
{
	System.out.println("withoutfinal");
}
public static void main(String args[]) {

	FinalDEmo f=new FinalDEmo();
	f.show();

	
}
}
