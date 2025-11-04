package CS210_Lab01;

public class sieveOfEratosthenes
{
    
    public static int counter = 0;
    
    
    public static void main(String args[])
    {
        
        int[] limit = {50,100,150,200,250,300,350,400,450,500,550,600,650,700,750,800,850,900,950,1000};
        
        int[] counterList = new int [limit.length];
        
        for(int i=0;i<counterList.length;i++)
        {
            counter = 0;
            sieveOfEratosthenes(limit[i]);
            counterList[i] = counter;
            System.out.println(limit[i] + " " + counterList[i]);
        }
        
        /*
        boolean[] isPrime = sieveOfEratosthenes(limit[i]);
        
        System.out.println("The prime number upto " + limit + ": ");
        
        for(int i =2;i<limit;i++)
        {
            
            if(isPrime[i]) //(isPrime[i]) equals (isPrime[i] == ture)
             {
                System.out.print(i + " ");
            }
        }
        System.out.println(); */
        
        
    }
    
        
        
    public static int sieveOfEratosthenes(int n)
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
                    counter++;
                }
            }
        }
        
        
        return counter;
        
    }
    
}