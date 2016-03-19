
import java.util.Scanner;
import javax.swing.JOptionPane;

public class GuessGameGUI
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int computerNum=1+(int)(Math.random()*10);
		int userInput=0, count=0;
		
		String name = JOptionPane.showInputDialog("Please enter your name");
		String intro = String.format("Hi %s, welcome to the Guess-A-Number game!", name);

		JOptionPane.showMessageDialog(null, intro);
		
		
		while (userInput != computerNum)
			{
			userInput = Integer.parseInt( JOptionPane.showInputDialog("Please enter a number between 1 and 10"));
		
			count++;
			
			String low = String.format("%d pick:   %d  is too small. Please try again.", count, userInput);		
			String winMessage = String.format
					("Congrats. You guessed it!\nThe correct number is %d.\n\nThank you for playing.", computerNum);
			String high = String.format("%d pick:   %d  is too large. Please try again.", count, userInput);
		
				if (userInput == computerNum)
						JOptionPane.showMessageDialog(null, winMessage);
				else if (userInput > computerNum)
						JOptionPane.showMessageDialog(null, high);
				else
						JOptionPane.showMessageDialog(null, low);
			}			
	}
}