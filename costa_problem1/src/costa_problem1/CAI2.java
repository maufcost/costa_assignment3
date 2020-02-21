package costa_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

	public static void main(String [] args) {
		CAI2 cai2 = new CAI2();
		cai2.quiz();
	}
	
	private final static String POSITIVE_RESPONSES[] = {
			"Very good!",
			"Excellent!",
			"Nice work!",
			"Keep up the good work!"
	};
	
	private final static String NEGATIVE_RESPONSES[] = {
			"No. Please try again.",
			"Wrong. Try once more.",
			"Don’t give up!",
			"No. Keep trying."
	};
	
	public void quiz() {
		// Generates random ints between 0 and 9.
		SecureRandom rand = new SecureRandom();
		int a = rand.nextInt(10); // SecureRandom (positive one-digit int).
		int b = rand.nextInt(10);
		int realAnswer = a * b;
				
		// Asking multiplication question.
		askQuestion(a, b);
		Scanner input = new Scanner(System.in);
		int userAnswer = readResponse(input);
		
		while (!isAnswerCorrect(realAnswer, userAnswer)){
			displayIncorrectResponse(rand.nextInt(4));
			askQuestion(a, b);
			userAnswer = readResponse(input);
		}
			
		// Successful answer.
		displayCorrectResponse(rand.nextInt(4));
	}
	
	private void askQuestion(int a, int b) {
		// Prints the problem to the screen.
		System.out.printf("How much is %d times %d?\n", a, b);
	}
	
	private int readResponse(Scanner in) {
		// Reads the answer from the student.
		return in.nextInt();
	}
	
	private boolean isAnswerCorrect(int realAnswer, int userAnswer) {
		// Checks to see if the student's answer matches the correct answer to the problem.
		return (realAnswer == userAnswer);
	}
	
	private void displayCorrectResponse(int randint) {
		// Prints out the response when a student enters a correct answer.
		// Required switch statement is below.
		switch(randint) {
		case 0:
			System.out.println(POSITIVE_RESPONSES[randint]);
			break;
		case 1:
			System.out.println(POSITIVE_RESPONSES[randint]);
			break;
		case 2:
			System.out.println(POSITIVE_RESPONSES[randint]);
			break;
		case 3:
			System.out.println(POSITIVE_RESPONSES[randint]);
			break;
		}
	}
	
	private void displayIncorrectResponse(int randint) {
		// Prints out the response when a student enters an incorrect answer.
		// Required switch statement is below.
		switch(randint) {
		case 0:
			System.out.println(NEGATIVE_RESPONSES[randint]);
			break;
		case 1:
			System.out.println(NEGATIVE_RESPONSES[randint]);
			break;
		case 2:
			System.out.println(NEGATIVE_RESPONSES[randint]);
			break;
		case 3:
			System.out.println(NEGATIVE_RESPONSES[randint]);
			break;
		}
	}
}
