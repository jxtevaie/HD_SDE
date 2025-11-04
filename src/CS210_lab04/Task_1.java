package CS210_lab04;

public class Task_1 {
	
	public static void main(String args[]) {
		
		int n = 5;
		System.out.println(sumup(5));
		System.out.println(n*(n+1)/2);
	}
	
	public static int sumup(int n) {
		int result = 0;
		if(n>=0) {
		result = n+sumup(n-1);}
		
		return result;
	}

}
