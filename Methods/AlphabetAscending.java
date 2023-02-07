package array.Class.Methods;

import java.util.Arrays;
import java.util.Comparator;

public class AlphabetAscending {

	public static void main(String[] args) {
		String []name= {"hariharan","Sridhar","arunkumar"};
		
		Arrays.sort(name);
		// Alphabet wise Ascending 	
		//Comparator<String> compare= new CompareAlphabet();
//		Arrays.sort(name,compare);
		
		for (String i:name)
		{
			System.out.println(i);
		}

	}

}
