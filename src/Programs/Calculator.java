package Programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
double num1=sc.nextDouble();
double num2=sc.nextDouble();

System.out.println("Enter the operation you want to perform:(+, -,* /)");

char op=sc.next().charAt(0);

double result;


switch (op) {
case '+':
	result=num1+num2;
	System.out.println(num1 + " + "+ num2+ " = "+result);
	break;
case '-':
	result=num1-num2;
	System.out.println(num1 + " - "+ num2+ " = "+result);
	break;
case '*':
	result=num1*num2;
	System.out.println(num1 + " * "+ num2+ " = "+result);
	break;
case '/':
	result=num1/num2;
	System.out.println(num1 + " / "+ num2+ " = "+result);
	break;

default:
	break;
}
	
	}

}
