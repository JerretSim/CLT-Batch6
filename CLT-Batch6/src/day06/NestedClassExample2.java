package day06;

public class NestedClassExample2 {
	
	void printMethod() {
		MyInnerClass1 ref  = new MyInnerClass1();
		MyInnerClass2 ref1 = new MyInnerClass2();
		ref.myMethod1();
		ref1.myMethod3();
	}
	
	class MyInnerClass1 { // non-static inner class
		void myMethod1() {
			System.out.println("I am in MyInnerClass1 ==> MyMethod1");
			
		}
		
		
		
		/*
		static void MyMethod2() { // compilation error, we can't write static method in non-static inner class
		
		}
	*/
	} // end of MyInnerClass1
	
	static class MyInnerClass2 { // static inner class
		
		void myMethod3() {
			System.out.println("I am in MyInnerClass2 ==> MyMethod3");
		}
		
		static void myMethod4() {
			System.out.println("I am in MyInnerClass2==>MyMethod4");
		}
		
	
	} // end of MyInnerClass 2 
	void access() { // method local inner class
		class MyInnerClass3 { // method local inner class
			
			void myMethod5() {
				
			}
			
			/* 
		     static void Mymethod6() { // compilation error, we can't write static method inside non-static inner class
		     }
			 */
			
		} // end of MyInnerClass3
	} // end of access
	
	public static void main (String [] args) {
		NestedClassExample2 ref = new NestedClassExample2();
		ref.printMethod();
		
	}

}
