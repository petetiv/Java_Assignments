
public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		int[] array = {11, 20, 30, 23, 50, 10};
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				System.out.println("Even Number: "+array[i]);
			}else {
				System.out.println("Odd Number: "+array[i]);
			}
		}

	}

}
