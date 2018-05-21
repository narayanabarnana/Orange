package programs;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	
	
	public static void removeDuplicates(int[] arraywithduplicates)
	{
		
		System.out.println("Array With Duplicates : "+Arrays.toString(arraywithduplicates));
		
		//Assuming all elements in input array are unique
		//size of the array
		int noOfUniqueElements = arraywithduplicates.length;
		
		//Comparing each element with all other elements
		for(int i=0;i<noOfUniqueElements;i++)
		{
			for(int j=i+1;j<noOfUniqueElements;j++) 
			{
				
				//If any two elements are found equal
				if(arraywithduplicates[i]==arraywithduplicates[j])
				{
					
					//Replace duplicate element with last unique element
					arraywithduplicates[j] = arraywithduplicates[noOfUniqueElements-1];
					
					//Decrementing noOfUniqueElements
                    noOfUniqueElements--;
                      
                    //Decrementing j
                    j--;
					
				}
				
				
				}
		}
		
		
		//Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
	    
	    int[] arrayWithoutDuplicates = Arrays.copyOf(arraywithduplicates, noOfUniqueElements);
	      
	    //Printing arrayWithoutDuplicates
	      
	    System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
	      
	    System.out.println("==============================");
		
		
	}
	
	public static void main(String[] args) {
		
		removeDuplicates(new int[] {4, 3, 2, 4, 9, 2});
        
        removeDuplicates(new int[] {1, 2, 1, 2, 1, 2});
          
        removeDuplicates(new int[] {15, 21, 11, 21, 51, 21, 11});
          
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});

	}

}



