import java.util.Scanner;

public class CAI2 {
	// public variables
	private Scanner inputScr = new Scanner(System.in);
		RandomX RandNum = new RandomX();
	public static void main(String[] args)

	{
		CAI2 app = new CAI2();
		app.quiz();
	}
	public void quiz()
	{
		int num1 = 0;
		int num2 = 0;
		int retResp = 0;
		int retAns = 0;
		int qloop = 0;
		
		num1 = RandNum.RandomNum(10);
		num2 = RandNum.RandomNum(10);
		
		System.out.println("***************************************************");
		System.out.println("*************    LEARN MULTIPLICATION   ***********");
		System.out.println("***************************************************");
		System.out.println("\n");
		while (qloop == 0)
		{
			askQuestion(num1,num2);
			retResp = readResponse();
			retAns = isAnswerCorrect(num1, num2, retResp);
			
			if (retAns == 1)
			{
				displayCorrectResponse();
				qloop = 1;
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
		int x1 = 0;
		x1 = RandNum.RandomNum(4);
		switch(x1) {
		case 0:
			System.out.print("\nVery good!\n");
			break;
		case 1:
			System.out.print("\nExecellent!\n");
			break;
		case 2:
			System.out.print("\nNice work!\n");
			break;
		case 3:
			System.out.print("\nKeep up the good work!\n");
			break;
		}
	}
	public void displayIncorrectResponse()
	{
		int x1 = 0;
		x1 = RandNum.RandomNum(4);
		switch(x1) {
		case 0:
			System.out.print("\nNo. Please try again.\n");
			break;
		case 1:
			System.out.print("\nWrong. Try once more.\n");
			break;
		case 2:
			System.out.print("\nDont give up!\n");
			break;
		case 3:
			System.out.print("\nNo. Keep trying.\n");
			break;
		}
	}
}