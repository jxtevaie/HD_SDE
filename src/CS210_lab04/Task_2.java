package CS210_lab04;

public class Task_2 {
	
	public static void main(String args[]) {
		String input = "Hello World";
		System.out.println(reverse(input));
	}
	
	public static String reverse(String input) {
		String newInput = "";
		if(input.length()>=1) {
		newInput = input.charAt(input.length()-1) + reverse(input.substring(0,input.length()-1));}
		
		return newInput;
	}
}
