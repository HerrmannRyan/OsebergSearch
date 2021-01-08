import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetSearches {
	
	// Method below accurately can take in separate lines without reading the blank ones
	public static String[] readFromFile() throws FileNotFoundException
	{
		Scanner file = new Scanner(new File ("LookUp"));
		String everyCombined = "";
		
		while (file.hasNext())
		{
			String currentLine = file.nextLine();
			
			if(!currentLine.equals(""))
			{
				everyCombined += currentLine + " ";
			}
		}
		
		String[] returnArray = everyCombined.split(" ");
		
		return returnArray;
		
	}

}
