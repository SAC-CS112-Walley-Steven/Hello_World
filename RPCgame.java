
import java.util.Scanner;

public class RPCgame {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		int computerPick = 1+(int)(Math.random()*3);
		String name;
		int userInput=0, decision=0;
		int gameCounter = 1;
		
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
			
			
			System.out.printf("\nGame %d\nPress 1 for Rock, 2 for Paper, 3 for Scissor: \n", gameCounter);
			userInput=input.nextInt();
			
			gameCounter ++;
			
			if (userInput == computerPick)
				System.out.printf("It's a Tie.\nWe both chose # %d", computerPick);
			if ((userInput==1)&& (computerPick == 2))
				System.out.printf("Im sorry, you lose. You chose # %d, I chose # %d\nPaper beats Rock", userInput, computerPick);
			if ((userInput==1)&&(computerPick==3))
				System.out.printf("Congrats, you win! You chose # %d, I chose # %d\nRock beats Scissor", userInput, computerPick);
			if ((userInput==2)&& (computerPick==1))
				System.out.printf("Congrats, you win! You chose # %d, I chose # %d\nPaper beats Rock", userInput, computerPick);
			if ((userInput==2)&&(computerPick==3))	
				System.out.printf("Im sorry, you lose. You chose # %d, I chose # %d\nScissor beats Paper", userInput, computerPick);
			if ((userInput==3)&&(computerPick==1))	
				System.out.printf("Im sorry, you lose. You chose # %d, I chose # %d\nRock beats Scissor", userInput, computerPick);
			if ((userInput==3)&&(computerPick==2))	
				System.out.printf("Congrats, you win! You chose # %d, I chose # %d\nScissor beats Paper", userInput, computerPick);
		
			System.out.print("\n\nPress 1 to play again, 2 to quit: ");
			decision = input.nextInt();
			
			if (decision ==2)
				System.out.println("\nThank you! Have a nice day.");
			
		}
					
	}

}
