package programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArrayUsingCollectionAPI {

	
	public static void removeDuplicates(int[] arraywithduplicates)
	{
		
		System.out.println("Array With Duplicates : ");
		for (int i = 0; i < arraywithduplicates.length; i++)
        {
            System.out.print(arraywithduplicates[i]+"\t");
        }
		
		 Set<Integer> set = new LinkedHashSet<Integer>();  //Use HashSet if you don't want insertion order
		 for (int i = 0; i < arraywithduplicates.length; i++) 
	     {
	            set.add(arraywithduplicates[i]);
	     }
		 
		//Converting set into an array
		Object[] arraywithoutduplicates=set.toArray();
		
		 //Printing arrayWithoutDuplicates
		System.out.println();
		
		for (int i = 0; i < arraywithoutduplicates.length; i++)
        {
            System.out.print(arraywithoutduplicates[i]+"\t");
        }
                 
        System.out.println();
                 
        System.out.println("==============================");
		
	}
	
	public static void main(String[] args) {
		
		removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
        
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
         
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
         
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});

	}

}
