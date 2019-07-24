package ATM;
import java.util.Arrays;
public class Question11 {
	static void toPrint() {
		int arr[] = {1,2,3,1,2,3,4};
		
		Arrays.sort(arr);
		int length = arr.length;
		length = removeDupeElement(arr,length); //remove duplicate elements
		for(int i =0;i<length;i++) { //looping 
			if (arr[i]==5) { // allows output to show 4 numbers
				System.out.print(arr[i]);
				break;
			}
			System.out.print(arr[i]+",");
			
		
		}
}
	
	static int removeDupeElement(int arr[],int n) {
		  int replaceIndex = 0;
	        int i,j;
	        for(i=0; i<arr.length; i++){
	            for(j=i+1; j<arr.length; j++) {
	                if(arr[j]!=arr[i]){
	                    break;
	                }
	            }
	           
	            arr[replaceIndex++] = arr[i];
	            i = j-1;
	        }
	        return replaceIndex;
	    }
		
	
	
public static void main(String []args) {
	toPrint();
}
}
	
