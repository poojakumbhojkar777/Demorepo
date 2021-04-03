package Programs;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
int fact=factorial(num);
System.out.println("Factorial of "+ num +" : " + fact);
	}

	public static int factorial(int num)
{
	if(num>=1)
	{
		return num* factorial(num-1);
	}
	else
		return 1;
}
}
