package CS210_Lab01;

import java.util.Scanner;

public class goldBack {
	
	public static void main(String args[])
	{
		
		Scanner input = new Scanner(System.in);
        System.out.println("Input a positive even number");
        int even = input.nextInt();
        
		boolean[] isPrime = sieve(even);
		
		for(int i =2;i<isPrime.length;i++)
		{
			
			for(int j =i;j<isPrime.length;j++)
			{
				if(isPrime[i] && isPrime[j])
				{
					if(i+j == even)
					{
						System.out.println(i + ","  + j);
					}
				}
			}
				
		}
		
	}
	
	
	
	public static boolean[] sieve(int limit)
    {
        boolean[] isPrime = new boolean[limit+1];
        
        for(int i =2;i<isPrime.length;i++)
        {
            isPrime[i] = true;
        }
        
        for(int j = 2;j*j<=limit;j++)
        {
            if(isPrime[j] == true)
            {
                for(int i=j*j;i<=limit;i+=j)  //what if int i=j?
                {
                    isPrime[i] = false;
                }
            }
        }
        
        return isPrime;
    }

}
