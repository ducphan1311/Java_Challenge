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

		for (int i = 0; i < list.size() - 1; i++) {
			String Str = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				if (Str.equals(list.get(j))) {
					list.remove(j);
				}
			}
		}
		System.out.println("String after deleting the same letters : " + list);

	}
}
//		HashSet<String> set = new HashSet<>(list);
//		list.clear();
//		list.addAll(set);
//		System.out.println("String after deleting the same letters : " + list);

//four
//one
//two
//three