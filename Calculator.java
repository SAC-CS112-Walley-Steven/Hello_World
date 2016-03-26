import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int operationValue=0;
		
		System.out.println("Calculator Program");
		
			System.out.print("\nPress + to add, - to subtract, * to multiply, / to divide: ");
			String operation = input.nextLine();
			
			System.out.print("\nEnter first number: ");
			double number1 = input.nextDouble();
			
			System.out.print("Enter second number: ");
			double number2 = input.nextDouble();
			
			if (operation.equals("+")) operationValue=1;
			if (operation.equals("-")) operationValue=2;
			if (operation.equals("*")) operationValue=3;
			if (operation.equals("/")) operationValue=4;
			
			double sum = number1+number2;
			double difference = number1-number2;
			double product = number1*number2;
			double quotient = number1 / number2;
		
			if (operationValue==1)
				System.out.printf("\n%.2f + %.2f = %.2f", number1, number2, sum);
			if (operationValue==2)
				System.out.printf("\n%.2f - %.2f = %.2f", number1, number2, difference);
			else if (operationValue==3)
				System.out.printf("\n%.2f * %.2f = %.2f", number1, number2, product);
			else
				System.out.printf("\n%.2f / %.2f = %.2f", number1, number2, quotient);
			
}
}