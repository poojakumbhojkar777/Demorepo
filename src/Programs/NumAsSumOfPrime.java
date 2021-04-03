package Programs;

public class NumAsSumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=34;
boolean flag=false;
for(int i=2;i<=num/2;i++)
{
	if(isPrime(i))
	{
		if(isPrime(num-i))
		{
			System.out.println(num+"="+i+" + " + (num-i));
			flag =true;
		}
	}
}

if(!flag)
{
	System.out.println("num cannot be expressed as addition of two prime num");
}

	}

	public static boolean isPrime(int num)
	{
		boolean isPrime=true;
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			 isPrime=false;
			}
		}
		return isPrime;
	}
}
