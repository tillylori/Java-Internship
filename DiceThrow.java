public class DiceThrow 
{
    public static void main (String[]args)
	{
		//Code a program which simulates a throw of a dice by producing
		//one random integer in the range 1 to 6.
		int random = (int)(Math.random()*6 + 1);
		System.out.println(random);
	}
}
