package com.method;

/*write a java program for calculator(sum,substraction,product,divide)
 * using methods
 */
public class Example4 {

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

public static void main(String[] args) 
{
	sum1();
	mode();
	product1();
	sub1();
	divide1();
	

	
}	
	
}

	


