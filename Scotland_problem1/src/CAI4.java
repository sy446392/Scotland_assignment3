import java.util.Scanner;

public class CAI4 {
	// public variables
	private Scanner inputScr = new Scanner(System.in);
	RandomX RandNum = new RandomX();
	int Qcount = 1;
	
	public static void main(String[] args) 
	{
		CAI4 app = new CAI4();
		app.quiz();		
	}
	public void quiz()
	{
		int num1 = 0;
		int num2 = 0;
		int retResp = 0;
		int retAns = 0;		
		int correctAns = 0;	
		int score = 0;
		int contflg = 0;
		int diffAns = 0;
		int qArg = 0;
		
		System.out.println("***************************************************");
		System.out.println("*************    LEARN MULTIPLICATION   ***********");
		System.out.println("***************************************************");
		System.out.println("\n");
		 diffAns = readDifficulty();
		    qArg = generateQuestionArgument(diffAns);
		
		while (Qcount <=10 )
		{
		   
			num1 = RandNum.RandomNum(qArg);
			num2 = RandNum.RandomNum(qArg);
			
			askQuestion(num1,num2);
			retResp = readResponse();
			retAns = isAnswerCorrect(num1, num2, retResp);
			
			if (retAns == 1)
				displayCorrectResponse();
			else
				displayIncorrectResponse();
			
			if (retAns == 1)
				correctAns ++;
			if (Qcount == 10)
			{
			   score = 100 * correctAns / 10;
			   displayCompleteMessage(score);
			   contflg = askContinueQuestion();	
			   if (contflg == 1)
			   {
				   Qcount = 1;
				   correctAns = 0;
			   }
			   else
				   break;
			}
			else
			   Qcount ++;			
		}
		System.out.print("\nGood Bye!...\n");
	}	
	public int askContinueQuestion()
	{
		System.out.print("\nDo want to solve new problem sets, enter 'Y' to continue ? ");
		String inputStr = inputScr.next().toUpperCase();
		switch (inputStr)
		{
			case "Y":
				return 1;		
		}		
		return 0;
	}
	
	public int generateQuestionArgument(int x)
	{
		int inputInt = 0;
		switch (x)
		{
		case 1:
			inputInt= 10;
			break;
		case 2:
			inputInt= 100;
			break;
		case 3:
			inputInt= 1000;
			break;
		case 4:
			inputInt= 10000;
			break;
		}
		return inputInt;
	}
	
	
	public int readDifficulty()
	{
		int inputInt;
		while(true) {
		System.out.print("\nPlease select difficulty level 1 to 4, 1 being easy and 4 most difficult");
	    inputInt = inputScr.nextInt();
		if(inputInt > 0 && inputInt <5)
			break;
			
		}
	
	return inputInt;
}
	
	public void askQuestion(int num1, int num2)
	{
		System.out.print(Qcount +"-->How much is " + num1 + " times " + num2 + " ?");
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
		switch (x1)
		{
		 case 0:
			 System.out.print("    ***Very good!***\n");
			 break;
		 case 1:
			 System.out.print("    ***Excellent***\n");	
			 break;
		 case 2:
			 System.out.print("    ***Nice work***\n");	
			 break;
		 case 3:
			 System.out.print("    ***Keep up the good work***\n");
			 break;
		}		
	}
	public void displayIncorrectResponse()
	{
		int x1 = 0;
		x1 = RandNum.RandomNum(4);
		switch (x1)
		{
		 case 0:
			 System.out.print("    ***No please try again.***\n");
			 break;
		 case 1:
			 System.out.print("    ***Wrong try once more***\n");
			 break;
		 case 2:
			 System.out.print("    ***Dont give up***\n");
			 break;
		 case 3:
			 System.out.print("    ***No keep trying***\n");
			 break;
		}
	}
	public void displayCompleteMessage(int score)
	{
		System.out.print("\nScore: " + score+"%\n");
		if (score > 75)
			System.out.print("\nCongratulations, you are ready to go to the next level!\n");
		else
			System.out.print("\nPlease ask your teacher for extra help!\n");
	}
}