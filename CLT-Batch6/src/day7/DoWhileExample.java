package day7;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		String choice;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("You have entered: "+name);
		
		System.out.println("Wish to continue :(yes/no)");
		choice = sc.next();
		}while(!choice.contentEquals("no"));
		System.out.println("Thank You!!");

	}

}
