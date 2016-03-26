import java.util.Scanner;

public class RPSgame {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int userValue = 0, play=0, gameCounter=1;
		String decision=null,name;
		String computerValue=null;
		double win=0;
		
		System.out.print("Please enter name: ");
		name=input.nextLine();
		
		System.out.printf("Hi %s, let's play Rock, Paper, Scissor!\n", name);
		
	do
	{
		int computerPick = 1+(int)(Math.random()*3);
		gameCounter++;
		
		System.out.print("\nPress R for Rock, P for Paper, S for Scissor: ");
		String userInput = input.nextLine();
		
		if (userInput.equals("R")||userInput.equals("r"))
			userValue = 1;
		if (userInput.equals("P")||userInput.equals("p"))
			userValue = 2;
		if (userInput.equals("S")||userInput.equals("s")) 
			userValue = 3;
		
		System.out.printf("\nYou chose %s.", userInput);
		
		if (computerPick==1) computerValue ="R";
		if (computerPick==2) computerValue="P";
		if (computerPick==3) computerValue="S";
		
		System.out.printf(" Computer chose %s.\n\n", computerValue);

		if (userValue == 1)
		{
			if (computerPick==1)
			{
				System.out.println("Its a tie.\nThis game will not count.");
			    --gameCounter;
			}
			else if (computerPick==2)
				System.out.println("You lose.\nPaper beats Rock.");
			else
			{
				System.out.println("You win!\nRock beats Scissor.");
				++win;
			}
		}
		if (userValue ==2)
		{
			if (computerPick==1)
			{
				System.out.println("You win!\nPaper beats Rock.");
				++win;
			}
			else if (computerPick==2)
			{
				System.out.println("Its a tie.\nThis game will not count.");
				--gameCounter;
			}
			else
				System.out.println("You lose.\nScissor beats Paper");
		}
		if (userValue ==3)
		{
			if (computerPick==1)
				System.out.println("You lose.\nRock beats Scissor");
			else if (computerPick==2)
			{
				System.out.println("You win.\nScissor beats Paper");
				++win;
			}
				else
			{
				System.out.println("Its a tie.\nThis game will not count.");
				--gameCounter;
			}
		}
		
		
		System.out.print("\nPress P to play again or E to exit and calculate results: ");
		decision = input.nextLine();
		
						
		if (decision.equals("E")||decision.equals("e"))
		{
			double winPercent = (win/(double)(gameCounter-1))*100;
			System.out.println("\n\nCalculating results..");
			System.out.printf("\nYou won %.0f out of %d games for a winning percentage of %.0f%%\n", win, (gameCounter-1), winPercent);
			if (winPercent > 50)
				System.out.println("\nYou are pretty good!");
			else
				System.out.println("\nYou need more practise..");	
		}
		
	}
	while (decision.equals("P")||decision.equals("p"));
	
	System.out.println("\nHave a nice day!");
	}
}