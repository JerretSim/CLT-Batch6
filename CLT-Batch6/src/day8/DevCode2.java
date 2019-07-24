package day8;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DevCode2 {
	//1. handle NullPointerException (pointing null)
	//2. handle NumberFormatException (BufferedReader)
	//3. InputMismatchException (Scanner)
	
	static void logic() throws IOException {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter Number : ");
		 * int number = sc.nextInt(); System.out.println(number);
		 */
		
		try {
			/*
			 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 * System.out.println("Enter number 2 "); int number =
			 * Integer.parseInt(br.readLine()); System.out.println(number);
			 */
			/*
			 * Scanner sc = new Scanner(System.in); System.out.println("Enter Number : ");
			 * int number = sc.nextInt(); System.out.println(number);
			 */
			
			Object ref = null;
			System.out.println(ref.toString()); // using heap memory
			 
	} 
	catch (NumberFormatException e) {
		System.out.println("Handled NumberFormatException");
	}
		catch (InputMismatchException e) {
			System.out.println("Handled InputMismatchException");
		}
		catch (NullPointerException e) {
			System.out.println("Handled NullPointerException");
		}
	}
}

	
