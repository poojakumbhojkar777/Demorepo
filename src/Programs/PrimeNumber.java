package Programs;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Start=10;
		int End=20;
		Boolean flag=true;
		while(Start<End)
		{

			for (int i=2;i<=Start/2;i++)
			{
				if(Start%i==0)
				{

					flag=false;
					break;	

				}

			}

			if(flag)
			{
				System.out.println(Start + " ");
			}

			Start++; 
		}


	}

}
