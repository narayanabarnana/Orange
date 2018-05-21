package programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoOfCharsWordsLinesInTextFile {

	public static void main(String[] args) throws IOException {
		
		
			String str;
			 //Initializing charCount, wordCount and lineCount to 0
	         
	        int charCount = 0;
	        int wordCount = 0;
	        int lineCount = 0;
		
			FileReader fr=new FileReader("C:\\Users\\Nbarnana\\Desktop\\Zurich\\test.txt");
			BufferedReader br=new BufferedReader(fr);
			
			 String currentLine = br.readLine();
			
			while(currentLine!=null)
			{
				//Updating the lineCount
                lineCount++;
                
                //Getting the number of words in current line
                String[] words=currentLine.split(" ");
                
                //Updating the word count
                wordCount=wordCount+words.length;
                
                //iterating each word
                for(String word: words)
                {
                	//updating the character count
                	charCount=charCount+word.length();
                	
                }
                
                //Reading the next line into current line
                currentLine=br.readLine();
			}
			
			System.out.println("Number Of Chars In A File : "+charCount);
            
            System.out.println("Number Of Words In A File : "+wordCount);
             
            System.out.println("Number Of Lines In A File : "+lineCount);
			
            br.close();
			
		} 
		

	}


