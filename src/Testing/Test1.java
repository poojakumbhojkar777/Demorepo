package Testing;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//tcpassed100tcskipped12tcfailed33
		
		
		int A1[]= {1,2,5,2,3,6};
		int original[] = {};
		int temp[] = {};
		
		for(int i=0;i<A1.length;i++)
		{
			original[i]=A1[i];
			
		}
		
		for(int j=0;j<A1.length;j++) {
			for(int k=j+1;k<A1.length;k++)
			{
				if(original[j]==original[k]);
				{
					temp[j]=original[j];
					
				}
				
				
			}
			
			
		}
	
		System.out.println(temp[].list);
		}
		
}
