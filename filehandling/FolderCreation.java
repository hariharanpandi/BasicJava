package filehandleling;

import java.io.File;

public class FolderCreation 
{
	public static void main(String[] args)
	{
		String url="E:\\Teamwork";
		fileconfigure(url);
	}

	public static void fileconfigure(String url) 
	{
		File file=new File(url);
		boolean status=file.exists();
		
		if (!status)
		{
			file.mkdir();
			System.out.println("Folder Created");
		}
		else 
		{
			System.err.println("Folder Already Exists");
		}
	}
}
