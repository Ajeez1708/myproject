package newpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		Set s=new HashSet<>();
		s.add("Selenium");
		s.add("Testing");
		s.add(100);
		s.add('&');
		s.add(200);
		s.add(300);
		System.out.println(s.size());
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
