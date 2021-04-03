package Programs;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//*****
// ****
//  ***
//   **
//    *
		int rows=5;
		for(int i=rows;i>=0;i--)
		{
			for(int j=i;j>1;j--)
			{
				System.out.println(" ");
			}
			
			for(int k=i;k<=i;k--) {
				
				System.out.println("*");
			}
			
			}
			System.out.println();
			
			System.out.println(" ");
		}
		
	}


