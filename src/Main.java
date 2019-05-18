import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		LineNumberReader reader = new LineNumberReader(new FileReader("src/code.txt"));
		
		String line = null;
		while ((line = reader.readLine()) != null)
		{
			System.out.printf(line + "\r\n");
			
		}
	}
}
