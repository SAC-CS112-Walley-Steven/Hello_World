//Calculator.java

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int decision, operation; 
		int done=0;
		String name;
		double quotient, number1, number2, sum, product, difference;
		

		System.out.print("Please enter you name: ");
		name = input.nextLine();
		
		System.out.printf("Hi %s, this program can calculate two numbers at a time only.", name);
		
		System.out.print("\n\nPress 1 to continue or 0 to end program: ");
		decision = input.nextInt();
		
		if (decision == 0)
			System.out.println("\nThank you. Have a nice day!");
		
		while (decision != 0)
		{		
			System.out.print("\nPlease enter the first number: ");
			number1 = input.nextDouble();
		
			System.out.print("Please enter the second number: ");
			number2 = input.nextDouble();
		
			sum = number1+number2;
			difference = number1-number2;
			product = number1*number2;
			quotient = number1 / number2;
		
			System.out.print("Press 1 for addition, 2 for subtraction, 3 for multiplication, or 4 for division: ");
			operation = input.nextInt();
		
			if (operation == 1)
			System.out.printf("\nAdding the two numbers yields %f\n", sum);
			if (operation == 2)
			System.out.printf("\nSubtracting the two numbers yields %f\n", difference);
			if (operation == 3)
			System.out.printf("\nMuliplying the two numbers yields %f\n", product);
			if (operation == 4)
			System.out.printf("\nDividing the two numbers yields %f\n", quotient);
			
			System.out.print("\nPress 1 to continue or 0 to end program: ");
			decision = input.nextInt();
			
			if (decision == 0)
				System.out.println("\nThank you. Have a nice day!");
					
		}	
					
	}

}
