
public class ArrayDupNumCount {

	public static void main(String[] args) {
		
		int [] arr = {11, 12,13, 14, 12, 3, 1, 8, 3}; 
		int count=0;
		
		 for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j]) {
	                	System.out.println(arr[j]);
	                	count++;
	                }
	                      
	            }  
	      } 
		 System.out.println("Duplicate Numbers Count in Array: "+count);

	}

}
