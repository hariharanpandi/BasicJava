package filehandleling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwritter 
{
	public static void main(String[] args) 
	{
		String url="E:\\Teamwork\\badjava.txt";
		try
		{
			FileWriter file=new FileWriter(url,true);
			BufferedWriter bufferwriter=new BufferedWriter(file);
			bufferwriter.newLine();
			bufferwriter.write("hello");
			bufferwriter.flush();
			bufferwriter.close();
			
			FileReader fileread=new FileReader(url);
			BufferedReader bufferread=new BufferedReader(fileread);
			String line=bufferread.readLine();
			while(line!=null)
			{
				System.out.println(line);
				line=bufferread.readLine();
			}
			bufferread.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
