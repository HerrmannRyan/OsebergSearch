import java.io.FileNotFoundException;

public class Runner {

	public static void main(String[] args) throws FileNotFoundException {
	
		String[] myInputs = GetSearches.readFromFile();
		
		for (String s: myInputs)
		{
			System.out.println(s);
		}
	}

}
