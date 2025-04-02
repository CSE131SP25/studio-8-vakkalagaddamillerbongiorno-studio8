package studio8;

import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class Quiz{
	private Question[] questions;
	/**
	 * Constructor
	 * @param questions
	 */
	public Quiz (Question[] q) {
		//throw new NotYetImplementedException();
		questions = q;
	}
	
	public Question[] getQuestions() {
		return questions;
	}
	
	/**
	 * Prompts the user to answer, then returns a String containing their answer.
	 * @param in
	 * @return String answer
	 */
	private String getUserAnswer(Scanner in) {
		System.out.print("Please enter your answer: ");
		String out = in.next();
		return out;
	}
	
	/**
	 * Gets the number of points possible in the quiz.
	 * @return int number of total points
	 */
	public int getTotalPoints() {
		//throw new NotYetImplementedException();
		int total = 0;
		for(int i = 0; i<questions.length; i++) {
			total += questions[i].getPoints();
		}
		return total;
	}
	
	/**
	 * Asks the user all question in the quiz, then prints out 
	 * the amount of points the user earned. This print statement
	 * should include "You earned ____ points"
	 * 
	 * @param in Scanner object to feed into getUserAnswer
	 */
	public void takeQuiz(Scanner in) {
		//throw new NotYetImplementedException();
		int t = 0;
		for(int i = 0; i<questions.length; i++) {
			questions[i].displayPrompt();
			String a = "";
			//a = this.getUserAnswer(in);
			questions[i].checkAnswer(this.getUserAnswer(in));
			
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO: Make your own Quiz!
	}
}
