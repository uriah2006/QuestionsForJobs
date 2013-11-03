package removeCharacterFromString;

import java.util.Scanner;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		// Declarations
		String word;
		String letter;
		Scanner input = new Scanner(System.in);
		// Declarations end

		// gets the word and the character that will be omitted
		System.out.print("enter the word you want to remove letters from:");
		word = input.nextLine();
		System.out.print("what letter squence do you want taken out:");
		letter = input.nextLine();
		input.close();
		
		//finds all of the sting letter and replaces it with nothing
		word = word.replaceAll(letter, "");
		System.out.println(word);
		
	}
}
