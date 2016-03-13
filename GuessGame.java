//This is a number guessing game

import java.util.Scanner;

public class GuessGame 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int randomNum = 0 + (int)(Math.random()*10);
		int guess=0, gameCounter = 0;
		String playAgain;
		
		System.out.println("This is a number guessing game!\n");
		
		while (guess != randomNum)
		{
			System.out.print("Pick a number between 1 and 10: ");
			guess = input.nextInt();
			
			gameCounter += 1;
			
				if (guess == randomNum)
				{
					System.out.printf("\nCongrats, you guessed it! %d was the number I was thinking of.\n", randomNum);
					System.out.printf("It took you %d tries to guess the correct number.",  gameCounter);
				}
				else if (guess > randomNum)
					System.out.println("\nYour number is too large. Please try again.\n");
				else
				{
					System.out.println("\nYour number is too small. Please try again.\n");
				}
		}
	}

}
