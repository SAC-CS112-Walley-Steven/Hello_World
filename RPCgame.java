
import java.util.Scanner;

public class RPCgame {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int computerPick = 1+(int)(Math.random()*3);
		String name;
		int userInput=0, decision=0;
		int gameCounter = 1;
		double winPercent, win=0;
		
		System.out.print("Please enter name: ");
		name=input.nextLine();
		
		System.out.printf("Hi %s, do you want to play Rock, Paper, Scissor?\nPress 1 for yes, 2 for no: ", name);
		decision=input.nextInt();
		
		if (decision ==1)
			System.out.println("\nOkay great!");
		else
			System.out.println("Thank you! Have a nice day.");
		
		while (decision ==1)
		{
			
			computerPick = 1+(int)(Math.random()*3);
			System.out.printf("\nGame %d\nPress 1 for Rock, 2 for Paper, 3 for Scissor: \n", gameCounter);
			userInput=input.nextInt();
			
			gameCounter ++;
			
			
			if (userInput == computerPick)
			{
				System.out.printf("It's a Tie.\nWe both chose # %d", computerPick);
				--gameCounter;
			}
			if ((userInput==1)&& (computerPick == 2))
				System.out.printf("Im sorry, you lose. You chose # %d, I chose # %d\nPaper beats Rock", userInput, computerPick);
			if ((userInput==1)&&(computerPick==3))
			{
				System.out.printf("Congrats, you win! You chose # %d, I chose # %d\nRock beats Scissor", userInput, computerPick);
				++win;
			}
			if ((userInput==2)&& (computerPick==1))
			{
				System.out.printf("Congrats, you win! You chose # %d, I chose # %d\nPaper beats Rock", userInput, computerPick);
				++win;
			}
			if ((userInput==2)&&(computerPick==3))	
				System.out.printf("Im sorry, you lose. You chose # %d, I chose # %d\nScissor beats Paper", userInput, computerPick);
			if ((userInput==3)&&(computerPick==1))	
				System.out.printf("Im sorry, you lose. You chose # %d, I chose # %d\nRock beats Scissor", userInput, computerPick);
			if ((userInput==3)&&(computerPick==2))	
			{
				System.out.printf("Congrats, you win! You chose # %d, I chose # %d\nScissor beats Paper", userInput, computerPick);
				++win;
			}
			
			System.out.print("\n\nPress 1 to play again, 2 to calculate results, 3 to quit: ");
			decision = input.nextInt();
			
			if (decision == 2)
			{
				winPercent = (win/(double)(gameCounter-1))*100;
				System.out.println("\n\nCalculating results..");
				System.out.printf("\nYou won %.0f out of %d games for a winning percentage of %.0f%%\n", win, (gameCounter-1), winPercent);
				if (winPercent > 0.50)
					System.out.println("\nNice job! Keep up the good work!");
				else
					System.out.println("\nYou need more practise..");
			}
			
			if (decision ==3)
				System.out.println("\nThank you! Have a nice day.");
		
		}
					
	}

}

// Good job...please allow user to enter R/P/S instead of 1/2/3
