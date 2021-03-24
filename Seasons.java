
public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] months= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int index=0;
		String month="March";
		
		for(int i=0;i<months.length;i++) {
			if(month.equalsIgnoreCase(months[i])) {
				index=i;
				break;
			}
		}
		
		if(index<=1 || index>=10) {
			System.out.println("Winter Season");
		}else if(index>=2 && index<=5) {
			System.out.println("Summer Season");
		}else if(index>=6 && index<=9) {
			System.out.println("Rainy Season");
		}
		
	}

}
