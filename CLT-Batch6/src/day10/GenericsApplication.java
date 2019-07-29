package day10;

// list<T> interface
interface Book<Programming> { // Programming is a type of book <T>
	void showDetails(Programming pRef); // void add(T ref)
} // end of book

class CoreJava<Java> implements Book<Java> { // ArrayList<T> implements List<T>

	@Override
	public void showDetails(Java jRef) { // 50 				// void add(R ref)


		System.out.println(jRef); // 50
		
	} // end of showDetails
	
} // end of CoreJava

public class GenericsApplication {

	public static void main(String[] args) {
		
		//int price = 50;
		
	     Integer price = 60;
		
		CoreJava<Integer> ref1 = new CoreJava<Integer>();
		ref1.showDetails(price);
		
		String name = ("Complete Reference"); // JAVA API defined class
		CoreJava<String> ref2 = new CoreJava<String>();
		ref2.showDetails(name);
		
		Person pRef = new Person();
		pRef.setName("Gary");
		CoreJava<Person> ref3 = new CoreJava<Person>(); // Person is user defined class in java 
		ref3.showDetails(pRef);
	
	}

}

class Person {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}

}