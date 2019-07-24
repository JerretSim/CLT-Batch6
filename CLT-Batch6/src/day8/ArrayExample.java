package day8;
import java.util.Scanner;
class Person implements MyPrototype {
	
	int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public MyPrototype clone() throws CloneNotSupportedException {
		System.out.println("\nCloning MyPrototype object");
		return (MyPrototype) super.clone();
	}
	
	
	
	/*
	 * @Override public String toString() { // converts object to string return id +
	 * "" +name; }
	 */
	
}
public class ArrayExample  {

	public static void main(String[] args) {
		
//	         String str[] = {"Physics", "Chemistry", "Maths",};
//	         
//	         for (int i = 0; i<str.length; i++) {
//	        	 
//	        	 System.out.println(str[i]);
//	         } // traditional for loop
//	         
//	         for (String temp : str) {
//	        	 
//	        	 System.out.println(temp);
//				
//			} //foreach loop
//	         
	         Scanner sc = new Scanner(System.in);
	         System.out.println("How many records you want to enter : ");
	         int number = sc.nextInt(); // 5
	         Person pRef[] = new Person[number]; // creating space in array

	         for (int i = 0; i < pRef.length; i++) {
	        	 System.out.println("Enter your ID : ");
	        	 int id = sc.nextInt();
	        	 System.out.println("Enter your Name : ");
	        	 String name = sc.next();
	        	 
	        	 Person p1Ref = new Person(); // storing record to insert the element e.g.:0,1,2,3,4
	        	 p1Ref.setId(id);
	        	 p1Ref.setName(name);
	        	 pRef[i] = p1Ref;
	        	 
	        	
	        	 
        } // end of for loop
        
         for(Person person : pRef) {
        	 System.out.println(person.getId() + " " + person.getName() ); // person is a reference of person class
        	 	         }
	      
		/*
		 * Person[] refPerson = (Person[]) pRef.clone(); { for(Person test : refPerson)
		 * { System.out.println("ID : " + test.getId() + " " + "Name : " +
		 * test.getName());
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
	         } 
	}	

	    
