package com.onlinecalculator.calculator.calctypes;

import java.lang.Math;
import java.util.Scanner;
public class StatisticCalc extends BasicCalc{
	Scanner s=new Scanner(System.in);
	double no_array[];
	
	public int menu()
	{
    	
		System.out.println("------***------");
    	System.out.println("1: Addition");
    	System.out.println("2: Subtraction");
    	System.out.println("3: Multiplication");
    	System.out.println("4: Division");
    	System.out.println("5: Mean");
    	System.out.println("6: Median");
    	System.out.println("7: Mode");
    	System.out.println("8: Standard Deviation");
    	System.out.println("9: Exit");
    	System.out.println("------***------");
    	System.out.println("Enter your choice");
    	c=s.nextInt();
    	return c;
	}

    public void userInputs()
    {
    	
    	if(c>=5 && c<=8){
    		
    		System.out.println("Enter the total number of values");
    		int len=s.nextInt();
    		no_array=new double[len];
    		for(int i=0;i<no_array.length;i++){
    			System.out.println("Enter Data:");
    			no_array[i]=s.nextInt();
    		}
    	}
    	
    	else{
    		
    		System.out.println("Enter first number");
        	a=s.nextInt();
        	System.out.println("Enter second number");
        	b=s.nextInt();
    	}
    }

    public void performOperation(){    	
    		switch(c)
    		{
    		
    		case 1:
      		case 2:
      		case 3:
      		case 4:
      			super.performOperation();
      			break;
      			
      		case 5:
      			System.out.println("Result: "+mean());
        		break;
        		
      		case 6:
      			System.out.println("Result: "+median());
        		break;
        		
      		case 7:
      			System.out.println("Result: "+mode());
        		break;
        		
      		case 8:
      			System.out.println("Result: "+Math.sqrt(mode()));
        		break;
        		
      		case 9:
      			System.out.println("Thank You");
        		break;
        		
      		default:
      			System.out.println("Invalid Selection");
    	}
       
    }
    
	double mean()
	{
		
		double sum=0;
		for(int i=0;i<no_array.length;i++){
			
			sum+=no_array[i];
		}
		
		double meanValue=sum/no_array.length;
		return meanValue;
	}
	
	double median()
	{
		
		int middle=no_array.length/2;
		if(no_array.length%2==1){
			
			double medianValue=no_array[middle];
			return medianValue;
		}
		
		else{
			
			double medianValue=no_array[middle-1]+no_array[middle];
			return medianValue;
		}
	}
	double mode ()
	{
		
		double modeValue=no_array[0];
		int maxCount=0;
		for(int i=0;i<no_array.length;i++){
			
			double value=no_array[i];
			int count=1;
			for(int j=0;j<no_array.length;j++){
				
				if(no_array[i]==no_array[j])
				count++;
				
				if(count>maxCount){
					
					modeValue=value;
					maxCount=count;
				}
			}
		}
			
		return modeValue;
	}
}