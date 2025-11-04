package CS210_Lab02;

public class search 
{

	public static void main(String args[])
	{
		
		int n = 400000000;
		int[] array = new int [n];
		
		for(int i =0;i<n;i++)
		{
			array[i] = i;
		}
		
		int num = (int)(Math.random()*n);
		
		 
		int linearResult = linear(array,num);
		
		long start = System.nanoTime();
		int binaryResult = binary(array,num);
		long end = System.nanoTime();
		
		long elapsedTime = (end - start) / 1_000_000;
		System.out.println("Execution time: " + elapsedTime + " ms");
		
		//System.out.println("linear result is " + linearResult);
		//System.out.println("binary result is " + binaryResult);
	}
	
	
	public static int linear(int[] array, int target){
		for(int i= 0;i<array.length;i++){
			if(array[i] == target){
				return i;
			}
		}
		
		return -1;
	}
	
	
	public static int binary(int[] array,int target){
		int left = 0;
		int right = array.length-1;
		
		while(left<=right){
			int mid = left+(right-left)/2; //why must mid determined in the while loop?
			
			if(array[mid] == target){
				return mid;
			}
			else if(array[mid] < target){
				left = mid+1;
			}
			else{
				right = mid-1;
			}
		}
		
		return -1;
		
	}
}
