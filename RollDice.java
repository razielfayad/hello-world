import java.util.Random;

public class RollDice {

	public static void main(String[] args) {
		Random dice = new Random();
		int number;	
	    	number = 25 * dice.nextInt(6);
		System.out.println(number);
	}

}
