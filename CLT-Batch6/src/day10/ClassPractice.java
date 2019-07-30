package day10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ClassPractice {

public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);

	    String[] answerkey = {"b","d","a","a"};
	    int n = 0;

	        int correct = 0;
	        int incorrect = 0;
	        String answer = "";

	        for (int i = 0; i < 1; i++){
	            System.out.println("What is ur name? \nA)Bob\nB)Gabriel\nC)Adam\nD)Gary");
	            answer = input.next();
	            if(answer.compareTo(answerkey[0])==0){
	                correct++;} 
	            else {incorrect++;}
	    
	            if(answer.compareTo(answerkey[0])==0){
	                correct++;}           
	            System.out.println("What is the Singapore Landmark? \nA)Merlion\nB)Singapore Flyer\nC)Cable Car\nD)Zoo");
	            answer = input.next();
	            
	           if(answer.compareTo(answerkey[0])==0){
	                correct++;} 
	           else {incorrect++;}
	            
	            System.out.println("What is the age of Singapore? \nA)54\nB)43\nC)45\nD)34");
	            answer = input.next();
	            
	            if(answer.compareTo(answerkey[0])==0){
	                incorrect++;}
	        }

	        if (correct > 1){
	            System.out.println("You passed.");
	        } else {
	           System.out.println("You failed.");
	        }
	        System.out.println("You have " + correct + " correct answers.");
	        System.out.println("You have " + incorrect + " incorrect answers.");
	

	
}
}