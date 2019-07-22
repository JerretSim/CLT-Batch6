package day06;

// nested (inner) class

// a. non-static inner class
// b. static inner class
// c. method local inner class
// d. anonymous inner class 

// example of non-static inner class

class JPMorgan{
	
	void adminAccess() { // non-static inner class
		class AdminJPMC{
			void display() {
				System.out.println("hello I am in Admin..");
			} // end of display
		}// end of AdminJPMC
		
		AdminJPMC ref = new AdminJPMC();
		ref.display();
		
	} // end of adminAccess
		
	static void adminAccess2() { //static inner class
			class FinanceJPMC{
				
				void display() {
					System.out.println("hello I am in Finance..");
				} // end of display
				
			}// end of FinanceJPMC
			 FinanceJPMC ref = new FinanceJPMC();
						ref.display();
		} // end of adminAccess2
	
	} //end of JPMorgan

 //end of JPMorgan




public class NestedClassExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how to display method and get the output??
		JPMorgan.adminAccess2();
		
		JPMorgan refJPMorgan = new JPMorgan();
		refJPMorgan.adminAccess();
		
	}
	
	}

	

