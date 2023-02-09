package filehandleling;

import java.io.File;
import java.io.IOException;

public class FileCreation 
{
	public static void main(String[] args)
	{
		String url="E:\\Teamwork\\java.txt";
		boolean status=filecreate(url);
		System.out.println(status);
	}

	public  static boolean filecreate(String url)
	{
		File file=new File(url);
		boolean status=file.exists();
		if (!status)
		{
			try 
			{
				if (!file.createNewFile())
				{
					status= false;
				}
				else
				{
					status= true;
				}
			} 
			catch (IOException exception) 
			{
				System.err.println(exception.getMessage());
			}
		}
		else
		{
			status =false;
			System.out.println("File already Exists");
		}
		return status;
	}
}
