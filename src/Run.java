import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!\nEnter words and I'll give you a funny story");
		
		// TODO 2) Ask the user for words. Use "in.nextLine()" for text and "in.nextInt()" for integers. 
		//TODO NOTICE: you MUST type "in.nextLine();" AFTER you do in.nextInt(). This is called "flushing the buffer"
		String noun1;
		int num1;
		String adj1;
		System.out.print("Noun: ");
		noun1=in.nextLine();
		System.out.print("Whole number: ");
		num1=in.nextInt();
		in.nextLine();
		System.out.print("Adjective: ");
		adj1=in.nextLine();
		
		// TODO 1) Write a story. Pick words to be replaced with user responses.
		System.out.println("Welcome "+noun1+" the "+ adj1+"! Ruler of the "+num1+" kingdoms!");
	}

}
