package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListInDescendingOrder {

	public static void main(String[] args) {
		
		
		ArrayList AL=new ArrayList();
		AL.add(10);
		AL.add(15);
		AL.add(91);
		
		int size=AL.size();
		
		Comparator comparator = Collections.reverseOrder();
		System.out.println("Before sorting  : "  + AL);
		
		Collections.sort(AL,comparator);
		System.out.println("After sorting  "  + AL);


	}

}
