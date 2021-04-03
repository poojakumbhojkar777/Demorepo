package Programs;

public class Factorial {
	int num=4;
	static int fact=1;
	
	public static void main(String[] args) {
		getFactorial(4);
		
		
	}
public static void getFactorial(int num)
{
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	
	System.out.println("Fact of "+ num +" is : "+fact);
}
}
