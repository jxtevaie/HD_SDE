package CS210_lab04;

public class Task_3B {
	
	public static void main(String args[]) {
		
		String A = "Navan";
		
		if(callPalindrome(A.toLowerCase())) {
			System.out.println(A + " is a palindrome");
		}
		else {
			System.out.println(A + " is NOT a palindrome");
		}
	}
	
	private static boolean isPalindrome(String input, int start, int end) {

		if(start>=end){
			return true;
		}
		
		if(input.charAt(start) == input.charAt(end)) {
			start++;
			end--;
			return isPalindrome(input,start,end);
		}
		else {
			return false;
		}
	
	}
	
	public static boolean callPalindrome(String input) {
		return isPalindrome(input, 0, input.length()-1);
	}

}
