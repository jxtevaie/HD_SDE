package CS210_lab04;

public class Task_4 {

	public static long powerRecursive(long a, int n) {
			
			if(n == 0) {
				return 1;}
			
			return a * powerRecursive(a, n-1);
			
			/*if(n>0) {
				return a * powerRecursive(a, n-1);
			}
			
			return -1;*/
			
		}
	
	public static long powerIterative(long a, int n) {
			long b = 1;
			while(n>=0) {
				b *= a;
				n--;
			}
			return b;
		}
	
	public static void main(String[] args) {
		 int n = 20000;
		 long a = 2;
		 long start = System.nanoTime();
		 powerRecursive(a, n);
		 long end = System.nanoTime();
		 System.out.println("Recursive time: " + (end - start) + " ns");
		 start = System.nanoTime();
		 powerIterative(a, n);
		 end = System.nanoTime();
		 System.out.println("Iterative time: " + (end - start) + " ns");
		} 
}
