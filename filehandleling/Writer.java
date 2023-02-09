package filehandleling;

import java.io.FileWriter;
import java.io.IOException;
public class Writer 
{
	public static void main (String[] args)
	{
		String url="E:\\Teamwork\\badjava.txt";
		try 
		{
			FileWriter writer=new FileWriter(url);
			writer.write("Hi Arun, How are you");
			writer.flush();
			writer.close();
			System.out.println("File Updated");
		} 
		catch (IOException exception) 
		{
			exception.printStackTrace();
		}
	}
}
