package programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class Find_All_Repeated_Words_In_Text_File_And_Their_Occurrences {

	public static void main(String[] args) throws Exception {
		
		
		//Creating wordCountMap which holds words as keys and their occurrences as values
		HashMap<String, Integer> wordcountmap=new HashMap<String, Integer>();
		BufferedReader br=null;
		
		br=new BufferedReader(new FileReader("C:\\\\Users\\\\Nbarnana\\\\Desktop\\\\Zurich\\\\test.txt"));
		
		//Reading the first line into currentLine
		String currentline=br.readLine();
		
		while(currentline!=null)
		{
			//splitting the currentLine into words
			String[] words=currentline.toLowerCase().split(" ");
			
			
		}

	}

}
