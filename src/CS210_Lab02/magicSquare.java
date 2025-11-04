package CS210_Lab02;
import java.util.Scanner; 

public class magicSquare {

	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number");
		int a = input.nextInt();
		
		int[][] array = new int[a][a];
		
		System.out.println("Please input numbers to fill the array");
		
		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j] = input.nextInt();
			}
		}
		
		System.out.println("You entered: ");
		for(int i =0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		if(magicSquare(array)) {
			System.out.println("The square is a magic square!");
		}
		else {
			System.out.println("The square is NOT a magic square!");
		}
		
		input.close();
	
	}
	
	public static boolean magicSquare(int[][] square) {
		int sum = 0;
		int n = square.length;
		

		for(int j=0;j<n;j++) {
			sum += square[0][j];
			}

		
		for(int i=1;i<n;i++) {
			int rowSum = 0;
			for(int j=0;j<n;j++) {
				rowSum += square[i][j];
			}
			if(rowSum != sum) {
				return false;
			}
		}
		
		for(int j=0;j<n;j++) {
			int colSum = 0;
			for(int i=0;i<n;i++) {
				colSum += square[i][j];
			}
			if(colSum != sum) {
				return false;
			}
		}
		
		int diagSum1 = 0;
		for(int i=0;i<n;i++) {
			diagSum1 += square[i][i];
		}
		
		if(diagSum1 != sum) {
			return false;
		}
			
		
		int diagSum2 = 0;
		for(int i=0;i<n;i++) {
		diagSum2 += square[i][n-1-i];
		}
		
		if(diagSum2 != sum) {
			return false;
		}
			
		
		return true;
	}
}
