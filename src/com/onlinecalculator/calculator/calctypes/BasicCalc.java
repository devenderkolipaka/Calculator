package com.onlinecalculator.calculator.calctypes;
import java.util.Scanner;
    public class BasicCalc
{
int a,b,c,res;

public BasicCalc()
        {
	a=0;
	b=0;
	c=0;
	res=0;
	}
	
	public int menu()
        {
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
    	System.out.println("3 for mulitiplication");
    	System.out.println("4 for division");
    	System.out.println("enter your choice");
    	Scanner S=new Scanner(System.in);
    	c=S.nextInt();
    	return 0;
    	
	}
	
    public void userInputs()
    {
    	Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        a=s.nextInt();
        System.out.println("Enter second number");
        b=s.nextInt();
     
        
    }

    public void performOperation()
{
    	
    	switch(c)
    	{
    	case 1: res=add();
               System.out.println(res);
                 break;
    	case 2: res=subtract();
    	          System.out.println(res);
    	        break;
    	case 3: res=multiply();
    	          System.out.println(res);
    	           break;
    	case 4: res=divide();
    	   System.out.println(res);
    	        break;
    	   
	}
}
    
    
	int add()
	{
		return a+b;
	}
	
	int subtract()
	{
		return a-b;
		
	}
	
	int multiply()
	{
		return a*b;
		
	}
	
	int divide()
	{
		return a/b;
		
	}
}
	