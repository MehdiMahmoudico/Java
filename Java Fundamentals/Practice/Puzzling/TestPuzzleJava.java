import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		char randomLetter = generator.getRandomLetter();
		String randomPassword = generator.generatePassword();
		ArrayList<String> randomPasswordSet = generator.getNewPasswordSet(5);
		System.out.println(randomRolls);
		System.out.println(randomLetter);
		System.out.println(randomPassword);
		System.out.println(randomPasswordSet);
    	        //..
		// Write your other test cases here.
		//..
	}
}
