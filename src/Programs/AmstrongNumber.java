package Programs;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//153=1*1*1+5*5*5+3*3*3=153
		int num=371;
		int actualnum=num;
	    int reminder=0;
	    double total=0;
	    
	    while(actualnum!=0)
	    {
	    	 reminder=actualnum%10;
	    	 total=total + Math.pow(reminder, 3);
	    	 actualnum=actualnum/10;
	    	 
	    }
	   
	    if(total==num)
	    {
	    	System.out.println(num + " is armstrong num");
	    	
	    }
	    else
	    {
	    	System.out.println(num + " not armstrong num");
	    }
	
		
		
	}

}
