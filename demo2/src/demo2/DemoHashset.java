package demo2;
import java.util.HashSet;
import java.util.Iterator;
public class DemoHashset {
public static void main(String args[])
{
HashSet<Integer> hs=new HashSet<Integer>();
hs.add(1);
hs.add(2);
hs.add(3);
hs.add(4);
hs.add(5);
hs.add(6);
hs.add(1);
hs.add(2);
hs.add(3);
hs.add(10);
hs.add(21);
hs.add(39);

System.out.println(hs);
for(int ele:hs)
	System.out.println(ele);
Iterator<Integer> it=hs.iterator();
while(it.hasNext())
{
	System.out.println("\n Iterator class"+it.next());

}
}
}
