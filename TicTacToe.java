import java.util.Scanner;

public class TicTacToe{
	public static void main (String[] args){
		
		Scanner input = new Scanner (System.in);
		int userInput1, userInput2;
		int win = 0, count=1;
		
		
		String [] array = {"0","1","2","3","4","5","6","7","8"};
		
		System.out.print("Welcome to the Tic Tac Toe Game!");
		
		while(win ==0 && count < 5)
		{
		count++;
			
		System.out.printf("\n\n|_%s_|_%s_|_%s_|\n|_%s_|_%s_|_%s_|\n|_%s_|_%s_|_%s_|", array[0],array[1], array[2], array[3], array[4], array[5],array[6],array[7], array[8]);
		
		System.out.print("\n\nPlayer 1, Enter a number: ");
		userInput1 = input.nextInt();
		
		if (userInput1 ==0)array[0]=("X");
		if (userInput1==1)array[1]=("X");
		if (userInput1 ==2)array[2]=("X");
		if (userInput1==3)array[3]=("X");
		if (userInput1 ==4)array[4]=("X");
		if (userInput1==5)array[5]=("X");
		if (userInput1 ==6)array[6]=("X");
		if (userInput1==7)array[7]=("X");
		if (userInput1 ==8)array[8]=("X");
		
		System.out.printf("\n|_%s_|_%s_|_%s_|\n|_%s_|_%s_|_%s_|\n|_%s_|_%s_|_%s_|", array[0],array[1], array[2], array[3], array[4], array[5],array[6],array[7], array[8]);
		
		System.out.print("\n\nPlayer 2, Enter a number: ");
		userInput2 = input.nextInt();
		
		if (userInput2 ==0)array[0]=("O");
		if (userInput2==1)array[1]=("O");
		if (userInput2 ==2)array[2]=("O");
		if (userInput2==3)array[3]=("O");
		if (userInput2 ==4)array[4]=("O");
		if (userInput2==5)array[5]=("O");
		if (userInput2 ==6)array[6]=("O");
		if (userInput2==7)array[7]=("O");
		if (userInput2 ==8)array[8]=("O");
		
		
		if (array[0].equals("X")&&array[1].equals("X")&&array[2].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[0].equals("X")&&array[3].equals("X")&&array[6].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[0].equals("X")&&array[4].equals("X")&&array[8].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[3].equals("X")&&array[4].equals("X")&&array[5].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[6].equals("X")&&array[7].equals("X")&&array[8].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[1].equals("X")&&array[4].equals("X")&&array[7].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[2].equals("X")&&array[4].equals("X")&&array[6].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		else if (array[2].equals("X")&&array[5].equals("X")&&array[8].equals("X")) 
		{
			System.out.print("\nPlayer 1 Wins!");
			++win;
		}
		
		if (array[0].equals("O")&&array[1].equals("O")&&array[2].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[0].equals("O")&&array[3].equals("O")&&array[6].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[0].equals("O")&&array[4].equals("O")&&array[8].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[3].equals("O")&&array[4].equals("O")&&array[5].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[6].equals("O")&&array[7].equals("O")&&array[8].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[1].equals("O")&&array[4].equals("0")&&array[7].equals("0")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[2].equals("O")&&array[4].equals("O")&&array[6].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		else if (array[2].equals("O")&&array[5].equals("O")&&array[8].equals("O")) 
		{
			System.out.print("\nPlayer 2 Wins!");
			++win;
		}
		
		}
		System.out.println("\n\nGame Over");
	}
}
// Good job, Steven.  Now please see if you can keep track of the wins in an array rather than int win;
// Also, create another array to hold player's move so you can play back if needed
