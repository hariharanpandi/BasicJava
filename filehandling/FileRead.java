package filehandleling;

import java.io.FileReader;
import java.io.IOException;

public class FileRead 
{
	public static void main(String[] args) 
	{
		String url="E:\\Teamwork\\Notes.DOCX"; 
		try 
		{
			FileReader file=new FileReader(url);
			int output=file.read();
			while(output!=-1)
			{
				System.out.print((char)output);
				output=file.read();
			}
			file.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
