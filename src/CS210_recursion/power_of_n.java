package CS210_recursion;

public class power_of_n {
	
	public static void main(String args[]) {
		int n,i,result;
		n = 2;
		i = 4;
		result = power(n,i);
		System.out.print(result);
		
	}
	
	public static int power(int n,int i) {
		//int result = 1;
		if(i<1) {
			return 1;
		}
		
		return n * power(n,i-1);
	}

}
