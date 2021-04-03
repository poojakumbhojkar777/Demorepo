package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		
int num=1234;

int ReverseNum=0;
int digit=0;

while(num!=0)
{
	digit=num%10;
	ReverseNum=ReverseNum*10+digit;
	num=num/10;
}

System.out.println("Reversed Number =" +ReverseNum);
	}

}
