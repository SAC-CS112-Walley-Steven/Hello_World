// Hello.java
// 1st in class lab

import java.util.Scanner;

public class Hello
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		int x, y, sum, difference, product, quotient;
		
		System.out.print ("Please enter a number: ");
		x = input.nextInt();
		
		System.out.print ("Please enter one more:  ");
		y = input.nextInt();
		
		sum = x + y;
		difference = x - y;
		product = x*y;
		quotient = x/y;
		
		System.out.printf ("The sum of your two number is %d\n", sum);
		System.out.printf ("The difference of your two numbers is %d\n", difference);
		System.out.printf ("The product of your two numbers is %d\n", product);
		System.out.printf ("The quotient of your two numbers is %d\n", quotient);
		
	}
}
