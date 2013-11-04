package permutationOfString;

import java.util.Scanner;
import java.util.Stack;

public class PermutationOfString {

	public static void main(String[] args) {
		// Declarations
		String word;
		Scanner input = new Scanner(System.in);
		// Declarations end

		//getting data
		System.out.print("What word do you want to permutate:");
		word = input.nextLine();
		input.close();

		//recursive approach
		System.out.print("recursive");
		recursive("", word);
		
		
		//iterative approach TODO NOT WORKING
		System.out.print("iterative");
		iterative(word);
	}

	// working
	private static void recursive(String prefix, String str) {
		int len = str.length();
		int i;
		
		//at end
		//if the string has nothing in it prints the what is has built
		if (len == 0) {
			System.out.println(prefix);	
		}
		
		
		//not at end 
		//it calls it self sending in permutations of the rest of the word
		else {
			for (i = 0; i < len; i++) {
				recursive(prefix + str.charAt(i),
						str.substring(0, i) + str.substring(i + 1, len));
			}
		}
	}

	
	// TODO : NOT WORKING
	private static void iterative(String word) {
		int i;
		String r, c;
		Stack<String> stack = new Stack<String>();
		for (i = 0; i < word.length(); i++) {
			stack.push(String.valueOf(word.charAt(i)));
		}
		r = stack.pop();
		while (!stack.empty()) {
			c = stack.pop();
		}
		/*
		 * list = originalString.split('') index = (0,0) list = [""] for
		 * iteration n in 1 to y: index = (index[1], len(list)) for string s in
		 * list.subset(index[0] to end): for character c in originalString:
		 * list.add(s + c)
		 */
	}
}
