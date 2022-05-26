package my_first_project;

public class Demo_static {
	int sid;
	String  sname;
	
 static String  collegename;
 public static void display()
 {
	 //static methods can access staic variable only
	 System.out.println(collegename);
 }
	public Demo_static() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_static d=new Demo_static();
		d.sid=10;
		d.sname="xyz";
        Demo_static.collegename="VIIT";
        System.out.println(d.sid+"\n"+d.sname+"\n"+Demo_static.collegename);
        Demo_static.display();//static varaible,methods are accessed by class name as they belong to class and not the object
	}

}
