package day8;

public class DevCode {
	
	static void logic(int number) {
		try {
			/*
			 * int temp = number/0; System.out.println(temp);
			 */
			
			int a[] = {10,20,30,40,50};
			a[50] = 5000;
			System.out.println(a[50]);
			
		Object ref = null;
		
		System.out.println(ref.toString());
			
		} catch (ArithmeticException e) {
			System.out.println("A number can't be divisible by 0. ");
		}
	
          catch (NullPointerException e) {
        	  System.out.println("Handled NullPointerException");
          }
		
		 catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("handled ArrayIndexOutOfBoundsException");
			}
		catch (Exception e) { //cannot be placed first as it's a super class
			System.out.println("Exception is the super class of all Exception classes");
		}
		
		finally {
			System.out.println("closing files..");
		}
		
	}

}
