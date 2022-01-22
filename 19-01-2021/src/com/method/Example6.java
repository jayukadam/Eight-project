package com.method;


import java.util.Scanner;

	/**
	 * Write a java program for calculator(sum, sub, product, division and mode).
     using methods, Scanner class, switch-case and while loop. 
	 */
	
	public class Example6 
	{

		//declare and initilize variable
		
	static int value1,value2,sum,sub,product,divide,mode;
	
	static Scanner scanner = new Scanner(System.in);
	
	//SUM
	
public static void sum1()
{

System.out.println("Enter first value: ");
 value1 = scanner.nextInt();
System.out.println("Enter second value: ");
value2 = scanner.nextInt();
sum = value1+value2;
System.out.println("sum: " +sum);
}

public static void sub1()
{

System.out.println("Enter first value: ");
 value1 = scanner.nextInt();
System.out.println("Enter second value: ");
value2 = scanner.nextInt();
sub = value1-value2;
System.out.println("sub: " +sub);
}


public static void product1()
{

System.out.println("Enter first value: ");
 value1 = scanner.nextInt();
System.out.println("Enter second value: ");
value2 = scanner.nextInt();
product = value1*value2;
System.out.println("product: " +product);
}

public static void divide1()
{

System.out.println("Enter first value: ");
 value1 = scanner.nextInt();
System.out.println("Enter second value: ");
value2 = scanner.nextInt();
divide = value1/value2;
System.out.println("divide: " +divide);
}


public static void mode()
{

System.out.println("Enter first value: ");
 value1 = scanner.nextInt();
System.out.println("Enter second value: ");
value2 = scanner.nextInt();
mode = value1%value2;
System.out.println("mode: " +mode);

}

//main 
public static void main(String[] args) 
	{
		while(true)
		{
		System.out.println("calculator menu:\n");
		System.out.println("sum:" +sum);
		System.out.println("sub:" +sub);
		System.out.println("product:" +product);
		System.out.println("divide:" +divide);
		System.out.println("mode:" +mode);
		System.out.println("stop:\n");
		
		
		System.out.println("select your operaton: ");
		int operator =scanner.nextInt();
		
		switch(operator)
		{
		case 1:
			sum1();
			System.out.println(".............");
			break;
			
		case 2:
			sub1();
			System.out.println(".............");
			break;
			
		case 3:
			product1();
			System.out.println(".............");
			break;
			
		case 4:
			divide1();
			System.out.println(".............");
			break;
			
		case 5:
			mode();
			System.out.println(".............");
			break;
			
		case 6:
			System.exit(0);
			System.out.println(".............");
			break;
			
		default:
			System.out.println("select valid operation...!");
			System.out.println("---------------------------");
				
		}
		}
	}

}		
		









	


