package CS210_lab04;

public class Task_3 {
	
	public static void main(String args[]) {
		String A = "Navan";
		String B = reverse(A);
		System.out.println(B);
		
		if(A.toLowerCase().equals(B.toLowerCase())) {
			System.out.println(A + " is a palindrome");
		}
		else {
			System.out.println(A + " is NOT a palindrome");
		}
		
		
	}
	
	public static String reverse(String input) {
		String newInput = "";
		if(input.length()>=1) {
		newInput = input.charAt(input.length()-1) + reverse(input.substring(0,input.length()-1));}
		
		return newInput;
	}

}
