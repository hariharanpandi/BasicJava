package filehandleling;

import java.io.File;

public class SubFolderCreate 
{
	public static void main(String[] args)
	{
		String url="E:\\Teamwork\\Dreamwork\\java";
		boolean result=subfolder(url);
		System.out.println(result);
	}
	
	private static boolean subfolder(String url) 
	{
		File folder=new File (url);
		boolean status=folder.exists();
		if(!status)
		{
			folder.mkdirs();
			return true;
		}
		else
		{
			return false;
		}
	}
}
