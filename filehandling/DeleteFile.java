package filehandleling;

import java.io.File;
import java.io.IOException;

public class DeleteFile extends FileCreation
{
	public static void main (String[]args)
	{
		String url="E:\\Teamwork\\java.txt";
		
		deletefile(url);
		
		try {
			renamefile(url);
		} catch (IOException e) 
		{	
			e.printStackTrace();
		}
		
	}

	public static void renamefile(String url) throws IOException
	{
		File file=new File(url);
		if (file.createNewFile())
			System.out.println(file.getName());
		String newname="E:\\Teamwork\\badjava.txt";
		File rename=new File(newname);
		if ( file.renameTo(rename))
			System.out.println("File name changed");
	}

	public static void deletefile(String url) 
	{
		File file=new File(url);
		if(file.delete())
			System.out.println("File/Folder deleted");
	}
}
