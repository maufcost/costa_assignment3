package costa_problem1;

import java.util.Scanner;
import java.security.SecureRandom;

public class CAI1 {
	
	public static void main(String[] args) {
		CAI1 cai1 = new CAI1();
		cai1.quiz();
	}

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
			displayIncorrectResponse();
			askQuestion(a, b);
			userAnswer = readResponse(input);
		}
			
		// Successful answer.
		displayCorrectResponse();
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
	
	private void displayCorrectResponse() {
		// Prints out the response when a student enters a correct answer.
		System.out.println("Very good!");
	}
	
	private void displayIncorrectResponse() {
		// Prints out the response when a student enters an incorrect answer.
		System.out.println("No. Please try again.");
	}
}
