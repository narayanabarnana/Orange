package utilities;

import java.util.Arrays;

public class SortTheListOfStringsUsingJavaCollection {

	public static void main(String[] args) {
		
		
		String[] inputlist={ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		
		System.out.println("Before sorting list :" );
		showList(inputlist);
		
		//Call to sort the arraylist
		Arrays.sort(inputlist);
		
		System.out.println("After sorting list :" );
		showList(inputlist);
		

	}
	
	
	public static void showList(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}


