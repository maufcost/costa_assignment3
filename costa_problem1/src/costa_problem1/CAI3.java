package costa_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {

	public static void main(String [] args) {
		
		CAI3 cai3 = new CAI3();
		cai3.quiz();
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
	
	private final static int NUM_OF_QUESTIONS = 10;
	
	public void quiz() {
		
		SecureRandom rand = new SecureRandom();
		Scanner input = new Scanner(System.in);
		int userAnswer;
		
		// Asking the ten multiplication questions.
		do {
			int num_of_correct_ans = 0;
			int num_of_incorrect_ans = 0;
			
			for(int i = 0; i < NUM_OF_QUESTIONS; i++) {
				
				// Generates random ints between 0 and 9.
				int a = rand.nextInt(10); // SecureRandom (positive one-digit int).
				int b = rand.nextInt(10);
				int realAnswer = a * b;
						
				// Asking multiplication question.
				askQuestion(a, b);
				userAnswer = readResponse(input);
				
				if (isAnswerCorrect(realAnswer, userAnswer)) {
					displayCorrectResponse(rand.nextInt(4));
					num_of_correct_ans++;
				}else {
					displayIncorrectResponse(rand.nextInt(4));
					num_of_incorrect_ans++;
				}
			}
					
			// Displaying the student's score.
			displayCompletionMessage(num_of_correct_ans);
			
			// Asking if the user wants to solve a new problem set.
			System.out.print("Would you like to solve a new problem set? (0=No, 1=Yes)\n>> ");
			userAnswer = readResponse(input);
		
		} while (userAnswer == 1);
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
	
	private void displayCompletionMessage(int score) {
		System.out.printf("You answered %d correct answers out of %d.\n", 
				score, NUM_OF_QUESTIONS);
		
		// Displaying the student's percentage score.
		double perc = ((double) score / NUM_OF_QUESTIONS) * 100;
		System.out.printf("Your percentage score is %.2f per cent.\n", perc);
		
		// Displaying proper message based on percentage result.
		if (perc < 75.0) {
			System.out.println("Please ask your teacher for extra help.");
		}else {
			System.out.println("Congratulations, you are ready to go to the next level!");
		}
	}
}
