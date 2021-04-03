package Testing;

import java.util.Scanner;

public class Main {
	
	public static Character NorepeatingCharacter(String str)
	{
		char chararr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(str.lastIndexOf(chararr[i])==str.indexOf(chararr[i]))
				return chararr[i];
		}
		return null;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print(NorepeatingCharacter(s.nextLine()));

	}

}
