import java.util.Scanner;

public class CAI5 {
	// public variables
	private Scanner inputScr = new Scanner(System.in);
	RandomX RandNum = new RandomX();
	int Qcount = 1;
	
	public static void main(String[] args) 
	{
		CAI5 app = new CAI5();
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
		int pType = 0;
		int rnd = 0;
		int mType = 0;
		
		System.out.println("***************************************************");
		System.out.println("*************    LEARN MULTIPLICATION   ***********");
		System.out.println("***************************************************");
		System.out.println("\n");
		
		diffAns = readDifficulty();	
		qArg = generateQuestionArgument(diffAns);
		pType = readProblemtype();		
		
		while (Qcount <=10 )		
		{
				
			num1 = RandNum.RandomNum(qArg);
			num2 = RandNum.RandomNum(qArg);
					
			mType = pType;			
			if (pType == 5) //Random
			{
				 while (true)
				 {
				   rnd = RandNum.RandomNum(5);
				   if (rnd > 0)
					   break;
				 }
				 mType = rnd;
			}
			
			askQuestion(num1,num2,mType);
			retResp = readResponse();
			retAns = isAnswerCorrect(mType, num1, num2, retResp);
			
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
				   diffAns = readDifficulty();	
				   qArg = generateQuestionArgument(diffAns);
				   pType = readProblemtype();
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
	public int readDifficulty()
	{
		int inputInt;
		while (true) 
		{		
			System.out.print("\nPlease select difficulty level 1 to 4, 1 beign easy and 4 most difficult: ");
			inputInt = inputScr.nextInt();
			if (inputInt > 0 && inputInt < 5)			
				break;
		}
		return inputInt;
	}
	public int readProblemtype()
	{
		int inputInt;
		while (true) 
		{		
			System.out.print("\n****Types Of Math****");
			System.out.print("\n1-> Addition");
			System.out.print("\n2-> Multiplication");
			System.out.print("\n3-> Subtraction");
			System.out.print("\n4-> Division");
			System.out.print("\n5-> Random maths");
			System.out.print("\nPlease select type of math from above (1 to 5) ->");
			inputInt = inputScr.nextInt();
			if (inputInt > 0 && inputInt < 6)			
				break;
		}
		return inputInt;
	}
	public int generateQuestionArgument(int x)
	{
		int inputInt=0;
		switch (x)
		{
		   case 1:
			   inputInt = 10;
			   break;
		   case 2:
			   inputInt = 100;
			   break;
		   case 3:
			   inputInt = 1000;
			   break;
		   case 4:
			   inputInt = 10000;			   
		}		
		return inputInt;
	}	
	public void askQuestion(int num1, int num2, int mType)
	{
		switch(mType)
		{
		   case 1:
			   System.out.print(Qcount +"-->How much is " + num1 + " plus " + num2 + " ?");
			   break;
		   case 2:
			   System.out.print(Qcount +"-->How much is " + num1 + " times " + num2 + " ?");
			   break;
		   case 3:
			   System.out.print(Qcount +"-->How much is " + num1 + " subtracted from " + num2 + " ?");
			   break;
		   case 4:
			   System.out.print(Qcount +"-->How much is " + num1 + " divided by " + num2 + " ?");
			   break;
		}
	}
	public int readResponse()
	{
		return inputScr.nextInt();	
	}
	public int isAnswerCorrect(int mType, int num1, int num2, int retResp)
	{
		int pAns = 0;
		switch(mType)
		{
		   case 1:
			   pAns = num1 + num2;
			   break;
		   case 2:
			   pAns = num1 * num2;
			   break;
		   case 3:
			   pAns = num1 - num2;
			   break;
		   case 4:
			   pAns = num1 / num2;
			   break;
		}		
		if (pAns == retResp)
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
		System.out.print("\nScore: " + score + "%\n");
		if (score > 75)
			System.out.print("\nCongradulations, you are ready to go to the next level!\n");
		else
			System.out.print("\nPlease ask your teacher for extra help!\n");
	}
}
