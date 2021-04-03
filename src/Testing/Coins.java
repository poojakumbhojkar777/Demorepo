package Testing;
import java.util.ArrayList;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0= Heads
		//1=Tails

		int n=1100;
		ArrayList<Integer> Coin= new ArrayList<Integer>(n);

		int count=0;
		for(int i=0;i<=n;i++)
		{
			Coin.add(0);
		}
		for (int i=1;i<n;i++)
		{
			for(int j=i-1;j<n;j=j+i)
			{
				if(Coin.get(j)==0)
				{
					Coin.set(j,1);
				}
				else
				{
				Coin.set(j,0);
				}

			}

		}

		
		for(int j=1;j<n;j++)
		{
			if(Coin.get(j)==1)
			{
				count=count+1;
			}
		}
		System.out.println(Coin);
		System.out.println(count +"" +"Coins will be showing in Heads");
	}



}

