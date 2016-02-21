// Addition.java
// addition and comparison practice program

import java.util.Scanner;


public class Addition 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int number1; 
		int number2;
		int sum;
		int product;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		product = number1 * number2;
		
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
	}
}
