package javaArrayPrograms;

import java.util.Arrays;

public class MissingNumberInIntegerArray {
	
	
			//Method to calculate sum of 'n' numbers
			public static int sumOfNnumbers(int n)
		    {
		        int sum = (n * (n+1))/ 2;
		  
		        return sum;
		    }
			
			//Method to calculate sum of all elements of array
			  
		    static int sumOfElements(int[] array)
		    {
		        int sum = 0;
		  
		        for (int i = 0; i < array.length; i++)
		        {
		            sum = sum + array[i];
		        }
		  
		        return sum;
		    }
		    
		    
	
	
	
	public static void main(String[] args) {
		
		int n = 20;
	    
        int[] a = {1, 4, 5, 3, 2, 8, 6,7,9,10,12,13,14,15,16,17,18,19,20};
  
        int sumOfNnumbers = sumOfNnumbers(n);
  
        int sumOfElements = sumOfElements(a);
  
        int missingNumber = sumOfNnumbers - sumOfElements;
  
        System.out.println("Input Array : "+Arrays.toString(a));
         
        System.out.println("Missing Number is = "+missingNumber);
		
		
	}

}
