
public class CurrentBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String typeOfUsage="Commercial";
		int noOfUnits=50;
		int billAmount=0;
		
		if(typeOfUsage.equalsIgnoreCase("Building")) {
			if(noOfUnits<=100) {
				billAmount=noOfUnits*3;
			}else if(noOfUnits>100) {
				billAmount=noOfUnits*4;
			}
			
			
		}else if(typeOfUsage.equalsIgnoreCase("Commercial")) {
			if(noOfUnits<=100) {
				billAmount=noOfUnits*10;
			}
		}
		
		System.out.println("Total Units: "+noOfUnits+"==  "+"Total Amount: "+billAmount);
		
		
	}

}
