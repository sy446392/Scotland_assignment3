import  java.security.SecureRandom;

public class RandomX {

	public int RandomNum(int x) 
	{
		int number = 0;
		SecureRandom rand = new SecureRandom();
		number = rand.nextInt(x);
		return number;
	}
	
}