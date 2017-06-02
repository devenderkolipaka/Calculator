package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
	
	static Scanner s=new Scanner(System.in);
	
public static void main(String args[]){
	
        char type;
        type=getType();
        if(type=='a')
        {
        	
        	BasicCalc bc=new BasicCalc();
        	bc.menu();
        	bc.userInputs();
        	bc.performOperation();
        }
        
        if(type=='b')
        {
       		
        	ScientificCalc sc=new ScientificCalc();
        	sc.menu();
        	sc.userInputs();
        	sc.performOperation();
        	
       	}
        	
        	if(type=='c')
        	{
        		
        		StatisticCalc st=new StatisticCalc();
        		st.menu();
            	st.userInputs();
            	st.performOperation();
        	}
 
    }
        
    static char getType()
    {
    	
    	System.out.println("------***------");
    	System.out.println("1: BasicCalc");
    	System.out.println("2: ScientificCalc");
    	System.out.println("3: StatisticCalc");
    	System.out.println("------***------");
    	System.out.println("Enter your choice");
    	int ch=s.nextInt();
    	
    	if(ch==1)
    	return 'a';
    	else if(ch==2)
    		return 'b';
    	else if(ch==3)
    		return 'c';
    	else
    		System.out.println("Invalid Selection");
    	return 'd';
    
    }
}