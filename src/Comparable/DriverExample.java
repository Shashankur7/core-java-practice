package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;;
public class DriverExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("om");
		list.add("raj");
		list.add("sham");
		list.add("arnav");
		
		System.out.println(list);
		
		 // Ascending order
        Collections.sort(list);
        System.out.println(list);

        // Descending order
        Collections.sort(list, (i1, i2) -> i2.compareTo(i1));
        System.out.println(list);
	}
}


