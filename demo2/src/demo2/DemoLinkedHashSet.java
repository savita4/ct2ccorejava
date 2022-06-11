package demo2;
import java.util.LinkedHashSet;
public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// no duplicates,order will be same as input
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("savi");
		lhs.add("kavi");
		lhs.add("pavi");
		lhs.add("ravi");
		lhs.add("tavi");
		System.out.println(lhs);
		for(String s:lhs)
			System.out.println(s);
	}
	

}
