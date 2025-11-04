package CS210_Lab01;

import java.util.Scanner;

public class goldbackConjecture
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a positive even number");
        int even = input.nextInt();
        
        // double check the input
        if(even<=0 || even % 2 !=0)
        {
            System.out.println("Invalid input, please try again.");
            return;  // is this necessary？
        }
        
        // call for sieve to find prime number
        boolean[] array = sieve(even);
        
        // storage the prime number
        int[] prime = new int[even+1];  //size should be one bigger than even
        int primeCount = 0;
        
        for(int i =2;i<prime.length;i++)
        {
            if(array[i])
            {
                prime[primeCount] = i;
                primeCount++;
            }
        }
        
        /* trim the array with onyl prime numbers
        int[] trimmedPrime = new int[primeCount];
        
        for(int i=0;i<trimmedPrime.length;i++)
        {
            trimmedPrime[i] = prime[i];
        } */
        
        
        //create the array for result prime
        int[] result = goldback(prime,even);
        
        //outprint the result 
        System.out.println("Goldback of " + even + " is: "  );
        
        if(result[0] == 0 && result[1] == 0)
        {
            System.out.println("No result for " + even);
        }
        else
        {
            System.out.print(result[0] + " + " + result[1]);
        }
        
        
    }
    
    
    public static int[] goldback(int[] array,int even)
    {
        
        int[] result = new int[2];
        
        for(int i = 0;i<array.length;i++)
        {
            for(int j = i;j<array.length;j++)
            {
                if(array[i] + array[j] == even)
                {
                    
                    result[0] = array[i];
                    result[1] = array[j];
                    return result;
                    
                }
            }
        }
        
        return result;
        
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