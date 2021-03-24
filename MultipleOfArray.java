
public class MultipleOfArray {

	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50, 10};
	      int mult = 1;
	      //Advanced for loop
	      for( int num : array) {
	    	  mult = mult*num;
	      }
	      System.out.println("Multification of array elements is:"+mult);
	   }
	    
}
