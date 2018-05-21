package programs;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileLineByLine {
	
	public static void main(String[] args) throws IOException {
		
		String str;
		try {
			
			FileReader fr=new FileReader("C:\\Users\\Nbarnana\\Desktop\\Zurich\\CarePoint-Occupation.txt");
			BufferedReader br=new BufferedReader(fr);
			
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error " + e.getMessage());
		}
		

	}

}
