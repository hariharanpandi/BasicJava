package array.Class.Methods;

import java.util.Arrays;
import java.util.Comparator;

public class AlphabetAscending {

	public static void main(String[] args) 
	{
		String []name= {"hariharan","Sridhar","arunkumar"};
		
		// Alphabet wise Ascending 
		Comparator com= new compareAlphabet();
		Arrays.sort(name,com);
		
		for (String i:name)
		{
			System.out.println(i);
		}

	}

}
