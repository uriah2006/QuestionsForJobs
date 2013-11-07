/*Uriah Sypolt
 * 11/7/2013
 * 
 * Word is a string with no spaces the constructor will fill in the size and if it is a palindrome
 * 
 */
package findLongestPalindromeInString;

public class Word {
	String data;
	boolean isPalindrome;
	int size;

	public Word(String data) {
		super();
		this.data = data;
		this.size = data.length();
		this.isPalindrome = this.palindromeCheck(data);
	}
	
	
	//checks from the out side in to determine if data2 is a palindrome.
	private boolean palindromeCheck(String data2) {
		int i;
		boolean r = true;
		for (i = 0; i < data2.length() / 2; i++) {
			if (!(data2.charAt(i) == data2.charAt((data2.length() - 1) - i))) {
				r = false;
			}
		}
		return r;
	}
}
