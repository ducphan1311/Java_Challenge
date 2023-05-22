package programs;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();	
		list.add("two");
		list.add("one");
		list.add("three");
		list.add("one");
		list.add("four");

		System.out.println("String after deleting the same letters");
		//four
		//one
		//two
		//three

	}
}
