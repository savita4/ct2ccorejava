package demo2;
import java.util.TreeSet;
public class Demotreeset {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("E");
		ts.add("B");
		ts.add("E");
		ts.add("C");
		ts.add("D");
		System.out.println(ts);
		for(String s:ts) {
			System.out.println(s);
		}
	}

}
