
public class HotelMenu {

	public static void main(String[] args) {
		
		String[] items= {"Dosa", "Idly", "Puri"};
		int[] cost= {30,20,40};
		int index=0;
		String item="Idly";
		int plates=4;
		
		for(int i=0;i<items.length;i++) {
			if(item.equalsIgnoreCase(items[i])) {
				index=i;
				break;
			}
		}
		
		System.out.println("Total Cost for "+plates+" Plates of "+item+" is: "+plates*cost[index]);
		
		
	}

}
