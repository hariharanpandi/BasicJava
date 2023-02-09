package filehandleling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyIMG
{
	public static void main(String[] args) 
	{
		String url="E:\\TeamWork\\Notes.DOCX";
		try
		{
			InputStream input=new FileInputStream(url);
			OutputStream output=new FileOutputStream(url);
			int content=input.read();
			while(content!=-1)
			{
				output.write(content);
				content=input.read();
			}
			output.flush();
			output.close();
			input.close();
		}
		catch (Exception exception)
		{
			exception.printStackTrace();
		}
	}
}
