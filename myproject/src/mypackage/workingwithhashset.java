package mypackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class workingwithhashset 
{

	public static void main(String[] args) 
	{
	Set value=new HashSet<>();
	value.add("Selenium");
	value.add("Testing");
	value.add(100);
	value.add('&');
	value.add(200);
	System.out.println(value.size());
	Iterator i=value.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	}

	}


