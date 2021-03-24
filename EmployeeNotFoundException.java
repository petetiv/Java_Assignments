package employee;

public class EmployeeNotFoundException extends Exception{
	
	String ex;
	
	EmployeeNotFoundException(String excep){
		ex=excep;
	}
	
	public String toString(){ 
		return ("Employee Not Found Exception Occurred: "+ex) ;
	}
	

}
