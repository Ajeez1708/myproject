package newpackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class list 
{
	    public static void main(String[] args)
	    {
        List<String>myList = new ArrayList<>();
   	    myList.add("Apple");
		myList.add("Banana");
		myList.add("Cherry");
		myList.add("Date");
		myList.add("Banana");
        System.out.println("Original List:");
		System.out.println(myList);
        System.out.println("Element at index 2: " + myList.get(2));
		String searchItem = "Cherry";
		boolean containsItem = myList.contains(searchItem);
		System.out.println("Does the list contain '" + searchItem + "': " + containsItem);
		int index = myList.indexOf("Banana");
		System.out.println("Index of 'Banana': " + index);
		myList.remove("Date");
		System.out.println("List after removing 'Date':");
		System.out.println(myList);
		System.out.println("Iterating through the list:");
		for (String fruit : myList)
		{
			System.out.println(fruit);
		}

		Collections.sort(myList);
		System.out.println("Sorted List:");
		System.out.println(myList);
		Collections.reverse(myList);
		System.out.println("Reversed List:");
		System.out.println(myList);
		boolean isEmpty = myList.isEmpty();
		System.out.println("Is the list empty: " + isEmpty);
		int size = myList.size();
		System.out.println("Size of the list: " + size);
		myList.clear();
		System.out.println("List after clearing:");
		System.out.println(myList);
		isEmpty = myList.isEmpty();
		System.out.println("Is the list empty after clearing: " + isEmpty);
	}
}
