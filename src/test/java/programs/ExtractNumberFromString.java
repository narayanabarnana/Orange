package programs;

import org.apache.xpath.operations.And;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		
		
		String str="nar786786bef3w35";
		
		int len=str.length();
		
		char [] ch=str.toCharArray();
		
		System.out.println("Length of the string is " + len);
		
		System.out.println("Length of the character array is " +  ch.length);
		
		System.out.println("Length of the string without using length function is " + str.lastIndexOf(""));
		
		for(int i=0;i<=ch.length-1;i++)
		{
			
			if((str.charAt(i) >= '0') && (str.charAt(i) <= '9'))
			{
				System.out.println(" The number is " + str.charAt(i));
			}

			
		}

	}

}
