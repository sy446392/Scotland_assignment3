import java.util.Scanner;

public class CAI1 {
	// public variables
	private Scanner inputScr = new Scanner(System.in);
	RandomX RandNum = new RandomX();
	public static void main(String[] args) 
	{
		CAI1 app = new CAI1();
		app.quiz();
	}
	public void quiz()
	{
		int num1 = 0;
		int num2 = 0;
		int retResp = 0;
		int retAns = 0;
		
		
		num1 = RandNum.RandomNum(10);
		num2 = RandNum.RandomNum(10);
		
		System.out.println("***************************************************");
		System.out.println("*************    LEARN MULTIPLICATION   ***********");
		System.out.println("***************************************************");
		System.out.println("\n");
		while (true)
		{
			askQuestion(num1,num2);
			retResp = readResponse();
			retAns = isAnswerCorrect(num1, num2, retResp);
			
			if (retAns == 1)
			{
				displayCorrectResponse();
				break;
			}
			else
				displayIncorrectResponse();		
		}	
	}	
	public void askQuestion(int num1, int num2)
	{
		System.out.print("How much is " + num1 + " times " + num2 + " ?");
	}	
	public int readResponse()
	{
		return inputScr.nextInt();	
	}
	public int isAnswerCorrect(int num1, int num2, int retResp)
	{
		if ((num1 * num2) == retResp)
		   return 1;
		else
		   return 0;
	}
	public void displayCorrectResponse()
	{
		
		
		System.out.print("\nVery good!\n");
	}
	public void displayIncorrectResponse()
	{
		System.out.print("\nPlease try again.\n\n");
	}
}