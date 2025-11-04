package CS210_Lab03;

public class NameSorting {
	
	
	public static void main(String args[]) {
		Customer[] customers = {
		new Customer("John", "Smith", 30),
		new Customer("Alice", "Brown", 25),
		new Customer("Bob", "Adams", 28),
		new Customer("Diana", "Clark", 35),
		new Customer("Diana", "Davis", 22),
		new Customer("Adam", "Smith", 51),
		new Customer("Mary", "Walsh", 18),
		new Customer("Adam", "Reed", 32),
		new Customer("Carl", "English", 29),
		new Customer("Bob", "Gates", 20)
		};
		

	selectionSort(customers);
	//bubbleSort(customers);
	
	for(Customer customer: customers) {
		customer.display();
	}
		
	}

	
	public static void selectionSort(Customer[] list) {
		int n = list.length;

		for(int i =0;i<n-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(list[j].name.compareTo(list[minIndex].name)<0) {
					minIndex = j;
				}
				if (list[j].name.compareTo(list[minIndex].name) == 0) {
					if(list[j].surname.compareTo(list[minIndex].surname)<0) {
						minIndex = j;
						}
					}
				}
			
				Customer temp = list[minIndex];
				list[minIndex] = list[i];
				list[i] =temp;
			}
			
			
	}
	
	public static void bubbleSort(Customer[] list) {
		
		for(int i=0;i<list.length-1;i++) {
			for(int j=0;j<list.length-i-1;j++) {
				if(list[j].age > list[j+1].age) {
					int temp = list[j].age;
					list[j].age = list[j+1].age;
					list[j+1].age = temp;
				}
			}
		}
	}
	
	

}
