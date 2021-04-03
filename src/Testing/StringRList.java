package Testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StringRList {
	public static void main(String [] args)
	{
		String S1="Pooja";
		
		char[] A1=S1.toCharArray();
		ArrayList<Character> L1=new ArrayList<Character>();
		for(int i=0;i<A1.length;i++)
		{
			L1.add(A1[i]);
		}
		Collections.reverse(L1);
		System.out.println(L1);
	
	}

}
