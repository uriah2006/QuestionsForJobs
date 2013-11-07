/*Uriah Sypolt
 * 11/7/2013
 * 
 * this program will read in a user inputed text and return the largest palindrome.
 * 
 */
package findLongestPalindromeInString;

import java.util.ArrayList;
import java.util.Scanner;

public class longestPalindrome {

	public static void main(String[] args) {
		// Declarations
		int i;
		String line;
		String[] lines;
		ArrayList<Word> wordList = new ArrayList<Word>();
		Word bigWord;
		Scanner input = new Scanner(System.in);
		
		
		// getting data
		System.out.print("enter the word you would like to be evaluated:");
		line = input.nextLine();
		input.close();

		
		
		//splits the sentences in to a list of strings
		lines = line.split(" ");

		
		
		//inputs the list of stings in a arraylist of words
		for (i = 0; i < lines.length; i++) {
			wordList.add(new Word(lines[i]));
		}

		
		
		//remove all non palindrome 
		for (i = 0; i < wordList.size(); i++) {
			if (!wordList.get(i).isPalindrome) {
				wordList.remove(i);
				i--;
			}
		}

		
		//checks palindrome size to determine the largest and prints it  
		if (wordList.isEmpty()) {
			System.out.println("the is no Palindromes in the text");
		} else {
			bigWord = wordList.get(0);
			for (i = 0; i < wordList.size() - 1; i++) {
				System.out.println(bigWord.data+" "+ wordList.get(i).data);
				if (bigWord.size < wordList.get(i + 1).size) {
					bigWord = wordList.get(i + 1);
				}
			}
			System.out.println(bigWord.data+" is your largest palindrome.");
		}

	}
}