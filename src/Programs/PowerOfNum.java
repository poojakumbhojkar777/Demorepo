package Programs;

public class PowerOfNum {
	
	public static void main(String args[])
	{
		//3*3*3*3
		int Num=9;
		int Power=4;
		int result=1;
		
		for(Power=4;Power>=1;Power--)
		{
			result=result*Num;
		}
		
		System.out.println(Power+ " of "+ Num + " is "+result);
	} 

}
