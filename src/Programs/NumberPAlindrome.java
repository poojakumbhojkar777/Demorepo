package Programs;

public class NumberPAlindrome {
	
	
	
	public int ReverseNum(int num)
	{
		int ReverseNum=0;
		while(num!=0)
		{
			int digit=num%10;
			ReverseNum=ReverseNum*10+digit;
			num=num/10;
			
			
		}
		System.out.println("ReversedNumber : "+ReverseNum);
		 return ReverseNum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num=121;
				NumberPAlindrome NR=new NumberPAlindrome();
		
				int ReverseNum = NR.ReverseNum(Num);
		
		if(Num==ReverseNum)
		{
			System.out.println("Number is Palindrome");
		}
		else
			{
			System.out.println("Number is not Palindrome");	
			}
	}

}
