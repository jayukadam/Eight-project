package com.method;

import java.util.Scanner;

/**write a java program for calculator(sum,sub,product,divide,mode)
  *using method,scanner class & switch condition
  */

public class Example5 {

	//declare and initialize variable
	static int value1=10,value2=20,sum,sub,product,divide,mode;
	
	//sum
 public static void sum1()
 {
	 sum=value1+value2;
	 System.out.println("sum: " +sum);
 }
 
//sub
public static void sub1()
{
	 sub=value1-value2;
	 System.out.println("sub: " +sub);
}

//product
public static void product1()
{
	 product=value1*value2;
	 System.out.println("product: " +product);
}

//divide
public static void divide1()
{
	 divide=value1/value2;
	 System.out.println("divide: " +divide);
}

//mode
public static void mode()
{
	mode=value1%value2;
	 System.out.println("mode: " +mode);
}
//main method

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("calculator menu\n");
    System.out.println("1.sum:");
    System.out.println("2.sub:");
    System.out.println("3.product:");
    System.out.println("4.divide:");
    System.out.println("5.mode:\n");


		System.out.println("select your operation:");
		int operator =scn.nextInt();
		
		switch(operator)
		{
		case 1:
			sum1();
			break;
			
		case 2:
			sub1();
			break;
			
		case 3:
			product1();
			break;
			
		case 4:
			divide1();
			break;
			
		case 5:
			mode();
			break;
			
			default:
				System.out.println("select valid operation.....!");
}

scn.close();


						
	}

}
