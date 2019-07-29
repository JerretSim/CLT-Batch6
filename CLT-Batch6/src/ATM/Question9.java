package ATM;
import java.util.*;
import java.util.stream.*;
import java.util.Scanner;
class Question9 { 
 	
           public static void main(String[] args) {
        	  String [] number;
        	  String [] values = {"AS","AB","BA","AD"};
        	   boolean contains = Arrays.stream(values).anyMatch("AB"::equals);
        	   if(contains) 
        	         System.out.println(contains);
        	      else
        	         System.out.println(values + " is not found.");
           }
	
}
