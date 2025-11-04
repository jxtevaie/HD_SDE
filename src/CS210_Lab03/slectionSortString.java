package CS210_Lab03;

public class slectionSortString {
	
	public static void main(String args[]) {
		String[] nameList = {"Dean", "Ben", "Eva", "Zack", "Della"};
		String[] selectionSorted = copyArray(nameList);
        selectionSortString(selectionSorted);
        System.out.println("\nSelection Sort:");
        printArray(selectionSorted);
		
	}
	
	public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

	public static String[] copyArray(String[] arr) {
        String[] copy = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
	
	public static void selectionSortString(String[] arr) {
		 int n = arr.length;
		 for(int i=0;i<n-1;i++) {
			 int minIdx = i;
			 for(int j=i+1;j<n;j++) {
				 if(arr[j].compareTo(arr[minIdx])<0) {
					 minIdx = j;
				 }
			 }
			 
			 String temp = arr[minIdx];
			 arr[minIdx] = arr[i];
			 arr[i] = temp;
		 }
		 
	 }
		 

}
