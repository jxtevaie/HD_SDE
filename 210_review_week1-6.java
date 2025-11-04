// 【Lecture 1】

// [List]: The most fundamental data structure. It's a collection of data elements in a sequence.
  // [Arrays]: A fixed-size list where elements are stored in contiguous memory locations. Accessing an element by its index is very fast.
  // [Linked Lists]: A list where elements (nodes) are not stored in contiguous memory. Each node contains the data and a reference to the next node in the sequence.
// [Queue]: A "First-In, First-Out" (FIFO) data structure. Like a line at a store—the first person in line is the first to be served. Operations are "enqueue" (add) and "dequeue" (remove).
// [Trees]: a non-linear data structure that organizes data in a hierarchical manner. Example: The family tree is a great example. You have a root node at the top, with branches leading to child nodes.

// The Sieve of Eratosthenes
public static boolean[] sieveOfEratosthenes(int n){
	 boolean[] prime = new boolean[n+1];  //size must be 1 bigger than input number
	        
	// Initialize all numbers as prime
	for(int i =2;i<=n;i++){
	    prime[i] = true;
	}
	        
	// Sieve of Eratosthenes algorithm
	for(int p =2;p*p<=n;p++){
	    if(prime[p]){
	    for(int i=p*p;i<=n;i+=p){   //i+=p counts the multipy of p, for each add the number multipy p once.
      prime[i] = false;
	    //counter++;
	      }
	    }
	  }
	  return prime;
  }

// 【Lecture 2】
// Array
// 1. declare array: type[] arrayName = new type[length]: int[] data = new int[10];
  //length is how many slot the array has, index always end at N-1, index starts at 0;
// 2. copy array: array must be of the same type
  double[] array1 = {1,5.3,5.2,6,9,5,2};
  double[] array2 = new double[array1.length];
  for(int i =0;i<array2.length;i++){
    array2[i] = array1[i];
  }
// 3. print array:
  for(int i =0;i<array.length;i++){
    System.out.print(array[i]);
  }
// 4. 2D array: row first then column;
type [][] array = new type[i][j];
for(int i =0;i<array.length;i++){
  for(int j =0; j<array[i].length;j++){
    array[i][j] = input.nextInt();
  }
}
// 5. random numbers
int[] randArray= new int[100];
for(int i =0;i<randArray.length;i++){
  randArray[i] = (int)(50+Math.random*(61-50));  //Math.random will genarate number in double type, the (int) is to convert double into int
}
// 6. linear search
public static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              return i; // Found at index i
          }
      }
      return -1; // Not found
}
// 7. counting matches: Count the number of items with a searchKey greater than a specified threshold
public static int countMatches(int[] arr,int threshold){
  int count = 0;
  for(int i=0;i<arr.length;i++){
    if(arr[i]> threshold){
      count++;
    }
  }
  return count;
}
// 8. find biggest
public static int findBig(int[] arr){
  int biggest = arr[0];
  for(int i =0;i<arr.length;i++){
    if(arr[i]>biggest){
      biggest = arr[i];
    }
  }
  return biggest;
}
// 9. insert array: must create a variable index to count from start how many slot are filled
public static void insert(int[]arr, int value){
  int[] arr = new int[10];
  int index =0;
  
  for(int i=0; i<=6;i++){
    arr[i] = (int)Math.random()*10.0;
    index ++;
  }

  arr[index] = value;
  index++;
}
// 10. growing array
// 11. binary search: the array must be sorted
public static int binarySearch(int[] arr, int target){
  int low = 0;
  int high = arr.length-1;
  
  while(low<=high){
    int mid = (low+high)/2;
    if(arr[mid] == target){
      return mid;
    }
    else if(arr[mid]< target){
      low = mid+1;
    }
    else if(arr[mid] > target){
      high = mid-1;
    }
  }

  return -1;
}


// 【Lecture 3】



  
