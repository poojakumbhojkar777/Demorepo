package Programs;

public class Febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0 1 1 2 3 5 8 13 21
		
		int num=10;
		int t1=0;
		int t2=1;
		
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(t1+ " ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			
		}

		
		
		
		
	}

}
