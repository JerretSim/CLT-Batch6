package ATM;
import java.io.*;
import java.util.Arrays;
public class Question12 {
	
	static void SecondLargest(int arr[], int length) {
		int first, second; 
		int arr_size = arr.length;
		
	     first = second = Integer.MAX_VALUE; 
	        for (int i = 0; i < arr_size ; i ++) 
	        { 
	            /* If current element is smaller than first 
	              then update both first and second */
	            if (arr[i] < first) 
	            { 
	                second = first; 
	                first = arr[i]; 
	            } 
	  
	            /* If arr[i] is in between first and second 
	               then update second  */
	            else if (arr[i] < second && arr[i] != first) 
	                second = arr[i]; 
	        } 
	        if (second == Integer.MAX_VALUE) 
	            System.out.println("There is no second" + 
	                               "smallest element"); 
	        else
	            System.out.println("The second Smallest Element is " + second);
	}

	static void SecondSmallest (int arr[], int length) {
		int i, first, second;
		first = second = Integer.MIN_VALUE;
		for (i = 0; i < length ; i++)
		{
            /* If current element is smaller than
            first then update both first and second */
			if (arr[i] > first)
			{
				second = first;
				first = arr[i];
			}

            /* If arr[i] is in between first and
               second then update second  */
			else if (arr[i] > second && arr[i] != first)
				second = arr[i];
		}

		if (second == Integer.MIN_VALUE)
			System.out.println("There is no second largest"+
					" element\n");
		else
			System.out.println("The second largest element"+
					" is "+ second);
	}
		
	static void toPrint() {
		int arr[] = {10,20,40,33,22,45,60,88};
		Arrays.sort(arr);
		int length = arr.length;
		Question12.SecondSmallest(arr, length);
		Question12.SecondLargest(arr, length);
	}
	public static void main(String[] args) {
			toPrint();
	}

	
	}



