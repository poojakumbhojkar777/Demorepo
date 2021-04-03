package Programs;

public class SumNaturalRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
int sum=addNumber(num);
System.out.println("Sum= "+sum);
	}

	public static int addNumber(int num)
	{
		if(num!=0)
		{
			return num+addNumber(num-1);
		}
		else return num;
		
	}
}
