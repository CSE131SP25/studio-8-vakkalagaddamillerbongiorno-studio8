package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String [] choices;
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] c) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		//throw new NotYetImplementedException();
		super(prompt, answer, points);
		choices = c;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	@Override
	public void displayPrompt() {
		//throw new NotYetImplementedException();
		super.displayPrompt();
		//System.out.println("The choices are: ");
		for(int i = 0; i<choices.length; i++) {
			System.out.println(i+1 + ". " + choices[i]);
		}
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		//throw new NotYetImplementedException();
		return choices;
	}
	
	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
	}

}
