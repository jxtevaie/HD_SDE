package CS210_Lab03;

public class Customer {
	 String name;
	 String surname;
	 int age;
	 
	 Customer(String name, String surname, int age) {
	 this.name = name;
	 this.surname = surname;
	 this.age = age;
	 }
	 
	 public String getName() {
		return name;
	 }
	 
	 public int getAge() {
			return age;
		 }
	 
	 public String getSurname() {
			return surname;
		 }
	 
	 public void display() {
	 System.out.println(this.name + " " + this.surname + " (" + this.age + ")");
	 }
} 

	
