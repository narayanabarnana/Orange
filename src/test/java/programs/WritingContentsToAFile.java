package programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingContentsToAFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		
		FileWriter filewriter=null;
		BufferedWriter bufferwriter=null;
		PrintWriter printwriter=null;
		
		//Opening a file in append mode using FileWriter
		filewriter=new FileWriter("C:\\Users\\Nbarnana\\Desktop\\Zurich\\test.txt",true);
		//Wrapping FileWriter object in BufferedWriter
		bufferwriter=new BufferedWriter(filewriter);
		//Wrapping BufferedWriter object in PrintWriter
		printwriter=new PrintWriter(bufferwriter);
		//Bringing cursor to next line
        printwriter.println();
        
        //Writing text to file
        
        printwriter.println("Venkatesh : 789546");
        printwriter.println("Daniel : 874566");
        printwriter.println("Shankar : 789546");
         
        System.out.println("Done");
        
        printwriter.close();
        bufferwriter.close();
        filewriter.close();
	}

}
