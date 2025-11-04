package CS210_recursion;

public class factorial {

	
	public static long factorial(long n) {
		if(n<0) {
			return -1;
		}
		if(n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void main (String args[]){
		long n,f;
		n =20;
		f = factorial(n);
		
		System.out.print(f);
	}
}
