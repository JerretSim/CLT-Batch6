package day09;


class User extends Throwable  {
	
	public User(String ref) {
		System.out.println(ref);
	}
	
	static void validateAge(int age) { // checking if the age is less than 18 or not 
		if(age<18) {
			User refUser = new User("Age cannot be less than 18"); // object of this class
			try {
				throw refUser; // use throw keyword to point memory address e.g.: any class reference, can do garbage collection properly	
			} catch (User e) {
				// System.out.println("Age cannot be less than 18");
				System.out.println("Exception Caught.. ");
			}
			finally {
				System.out.println("closing files..");
			}
		}  
	}
	
}

public class ThrowExample {

	public static void main(String[] args) {
		
		User.validateAge(17);
		

	}

}
