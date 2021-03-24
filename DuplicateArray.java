public class DuplicateArray {

		    public static int removeDupNumbers(int intArray[], int arrayLength) {
		        if (arrayLength == 0 || arrayLength == 1) {
		            return arrayLength;
		        }
		        int[] temp = new int[arrayLength];
		        int j = 0;

		 

		        for (int i = 0; i < arrayLength - 1; i++) {
		            if (intArray[i] != intArray[i + 1]) {
		                temp[j++] = intArray[i];
		            }
		        }

		 

		        temp[j++] = intArray[arrayLength - 1];
		        for (int i = 0; i < j; i++) {
		            intArray[i] = temp[i];
		        }

		 

		        return j;
		    }

		 

		    public static void main(String[] args) {
		        int intArray[] = { 10,1,22,22,1};
		        int arrayLength = intArray.length;
		        arrayLength = removeDupNumbers(intArray, arrayLength);
		        System.out.println("After remove duplicates");
		        for (int i = 0; i < arrayLength; i++)
		            System.out.print(intArray[i] + " ");
		        }

		 

		}