package ATM;
import java.util.Arrays;
public class Question13 {
	static void toPrint() {
		int arr[] = {20,20,30,40,50,50,50};
		
		Arrays.sort(arr);
		int length = arr.length;
		length = removeDupeElement(arr,length); //remove duplicate elements
			
		
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
	        System.out.println(replaceIndex);
	        return replaceIndex;
	        
	    }
		
	
	
public static void main(String []args) {
	toPrint();
}
}
	
