// Hello.java
// 1st in class lab

import java.util.Scanner;

public class Hello
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		int x, y, sum;
		
		System.out.print ("Please enter a number: ");
		x = input.nextint();
		
		System.out.print ("Please enter one last number and I'll add them together:  ");
		y = input.nextint();
		
		sum = x + y;
		
		System.out.printf ("The sum of your two number is %d\n", sum);
		
		
	}
}
