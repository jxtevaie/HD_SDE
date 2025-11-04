package CS210_Lab02;
import java.util.Scanner;

public class palindrome 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);	
		System.out.println("Please input a number");
		int[] array = new int[input.nextInt()];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = input.nextInt();
		}
		
		int[] newArray = reverse(array);
		
		/*System.out.println("The array is");
		
		for(int i =0;i<array.length;i++)
		{
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		System.out.println("The new array is");
		
		for(int i =0;i<newArray.length;i++)
		{
			System.out.print(newArray[i] + " ");
		}*/
		
		
		boolean isPalindrome = true;
		
		for(int i =0;i<newArray.length;i++)
		{
			if(newArray[i] != array[i])
			{
				isPalindrome = false;
			}
		}
		
		
		if(isPalindrome)
		{
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.print("is a palindrome.");
		}
		else
		{
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.print("is not a palindrome.");
		}
		
		
		input.close();
	}
	
	
	public static int[] reverse(int[] array)
	{
		int start =0;
		int end = array.length-1;
		int temp = 0;
		int[] newArray = new int[array.length];
		
		
		while(start<=end)
		{
			temp = array[start];
			newArray[start] = array[end] ;
			newArray[end] = temp;
			start++;
			end--;
		}
		
		return newArray;
	} 
	
}
