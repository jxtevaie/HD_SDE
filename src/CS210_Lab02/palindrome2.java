package CS210_Lab02;
import java.util.Scanner;

public class palindrome2 {

	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please input a number");
		int[] array = new int[input.nextInt()];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = input.nextInt();
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		
		if(isPalindrome(array)) {
			System.out.print("is a palindrome.");
		}
		else {
			System.out.print("is NOT a palindrome.");
		}
			
	}
	
	public static boolean isPalindrome (int[] array) {
		int j = array.length-1;
		
		for(int i = 0;i<array.length/2;i++){
			if(array[i] != array[j]) {
				return false;
			}
			j--;
		}
		
		return true;
	}
	
	
}
