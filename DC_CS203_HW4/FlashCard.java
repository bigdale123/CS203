package dylcal13_HW4;

public class FlashCard{
	private String question;
	private String answer;
	
	public FlashCard(String question, String answer) {
		this.answer = answer;
		this.question = question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getQuestion() {
		return this.question;
	}
	public String getAnswer() {
		return this.answer;
	}
	// Prints a formatted series of strings that looks like a flash card
	public void printQuestion() {
		System.out.println();
		System.out.print("---");
		for(int j = 0;j < question.length();j++) {
			System.out.print("-");
		}
		System.out.print("---\n");
		System.out.print("|  ");
		for(int j = 0;j < question.length();j++) {
			System.out.print(" ");
		}
		System.out.print("  |\n");
		System.out.println("|  "+question+"  |");
		System.out.print("|  ");
		for(int j = 0;j < question.length();j++) {
			System.out.print(" ");
		}
		System.out.print("  |\n");
		System.out.print("---");
		for(int j = 0;j < question.length();j++) {
			System.out.print("-");
		}
		System.out.print("---\n");
	}
	public void printAnswer() {
		System.out.println();
		System.out.print("---");
		for(int j = 0;j < answer.length();j++) {
			System.out.print("-");
		}
		System.out.print("---\n");
		System.out.print("|  ");
		for(int j = 0;j < answer.length();j++) {
			System.out.print(" ");
		}
		System.out.print("  |\n");
		System.out.println("|  "+answer+"  |");
		System.out.print("|  ");
		for(int j = 0;j < answer.length();j++) {
			System.out.print(" ");
		}
		System.out.print("  |\n");
		System.out.print("---");
		for(int j = 0;j < answer.length();j++) {
			System.out.print("-");
		}
		System.out.print("---\n");
	}
}