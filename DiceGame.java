import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		int playAgain, roll, userInput, gameCount=1;
		String userChoice = null;
		double win=0, evenWin = 0, oddWin = 0;
	
		
		System.out.println("This is a dice game. Guess if the dice will be odd or even.");
		
		do
		{
			int diceNum = 1 + (int)(Math.random()*6);
			
			gameCount++;
			
			System.out.print("\nPress 1 for odd or 2 for even: ");
			userInput = input.nextInt();
			
			if (userInput ==1) userChoice="Odd";
			if (userInput ==2) userChoice="Even";
			
			System.out.printf("You chose %s", userChoice);
			
			System.out.print("\n\nPress 1 to role the dice: ");
			roll = input.nextInt();
			
			System.out.printf("Dice number is %d\n\n", diceNum);
			
			if (userInput ==1)
			{
				if (diceNum == 1 || diceNum ==3 || diceNum ==5)
				{
					System.out.println("Congratulations! You guessed it. The dice rolled an odd number.");
					++win; ++oddWin;
				}
				else
					System.out.println("Sorry, you lose. The dice rolled an even number.");
			}
			else if (userInput ==2)
			{
				if (diceNum == 2 || diceNum ==4 || diceNum == 6)
				{
					System.out.println("Congratulations! You guessed it. The dice rolled an even number.");
					++win; ++evenWin;
				}
				else
					System.out.println("Sorry, you lose. The dice rolled an odd number.");
					
			}
			
			System.out.print("\n\nPress 1 to play again or 2 to exit and calculate results: ");
			playAgain = input.nextInt();
			
			
			if (playAgain == 2)
			{
				double winPercent = (win/(double)(gameCount-1))*100;
				System.out.println("\n\nCalculating results..\n");
				System.out.printf("You won %.0f out of %d games for a winning percentage of %.0f%%.", win, (gameCount-1), winPercent);
				System.out.printf("\nWhen choosing even, you won %.0f times.\nWhen choosing odd, you won %.0f times.", evenWin, oddWin);
				System.out.println("\n\nThank you! Have a nice day");
			}
		}
		while (playAgain ==1);

	}

}
