package Testing;

public class StringR {

	public static void main(String args [])
	{
		String S1 = "Pooja";
		
		char[] A1=S1.toCharArray();
		for(int i=A1.length-1; i>=0;i--)
		{
			System.out.print(A1[i]);
		}
		
	}
}
