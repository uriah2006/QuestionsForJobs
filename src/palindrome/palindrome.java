package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Declarations
		int i;
		boolean palindrome=true;
		String word;
		Scanner input = new Scanner(System.in);
		// Declarations end
		
		
		//gets the word that need to be evaluated
		System.out.print("enter the word you would like to be evaluated:");
		word = input.nextLine();
		input.close();
		
		//loop that check the letters from out side in
		for (i = 0; i < word.length() / 2; i++) {
			
			
		// looks out the out side letters and checks them if they don't match
		// don't check any more 
			if (!(word.charAt(i)==word.charAt((word.length() - 1) - i))){
				System.out.println(word+" is not a palindrome");
				palindrome=false;
				break;
			}
		}
		
		
		// if word is a palindrome
		if (palindrome){
			System.out.println(word+" is a palindrome");
		}
	}

}
