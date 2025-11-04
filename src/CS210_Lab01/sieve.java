package CS210_Lab01;

public class sieve {
	
	 public static void main(String args[])
	 {
		 int limit = 1000;
		 boolean[] isPrime = sieveOfEratosthenes(limit);
		 
		 System.out.println("The prime number less than " + limit + ": ");
		 for(int i=2;i<limit;i++)
		 {
			 if(isPrime[i])
			 {
				 System.out.print(i + " ");
			 }
		 }
	 }
	 
	 public static boolean[] sieveOfEratosthenes(int n)
	    {
	        boolean[] prime = new boolean[n+1];  //size must be 1 bigger than input number
	        
	         // Initialize all numbers as prime
	        for(int i =2;i<=n;i++)
	        {
	            prime[i] = true;
	        }
	        
	        // Sieve of Eratosthenes algorithm
	        for(int p =2;p*p<=n;p++)
	        {
	            if(prime[p])
	            {
	                for(int i=p*p;i<=n;i+=p) //i+=p counts the multipy of p, for each add the number multipy p once.
	                {
	                    prime[i] = false;
	                    //counter++;
	                }
	            }
	        }
	        
	        
	        return prime;
	        
	    }

}
