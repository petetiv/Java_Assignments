
public class MultOfNumbers {

	public static void main(String[] args) {
		int num = 10, 
		count = 1, 
		total = 1;

	       while(count <= num)
	       {
	           total = total * count;
	           count++;
	       }

	       System.out.println("Multiple of first "+num+" natural numbers is: "+total);
	    }
	
	}
