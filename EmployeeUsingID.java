package employee;

import java.util.ArrayList;

public class EmployeeUsingID {

	public static void main(String[] args) {
		
		int employeeID=3; 
		
		ArrayList<Employee> empList=new ArrayList();
		empList.add(new Employee("Emp1",1,10000));
		empList.add(new Employee("Emp2",2,20000));
		empList.add(new Employee("Emp3",3,30000));
		empList.add(new Employee("Emp4",4,40000));
		empList.add(new Employee("Emp5",5,50000));
		
		
		try {
			int requiredID=0;
			for(int i=0;i<empList.size();i++) {
				Employee emp=empList.get(i);
				if(emp.getEmpID()==employeeID) {
					requiredID=emp.getEmpID();
					System.out.println("Emploee ID: "+emp.getEmpID()+"  "+"Name: "+emp.getEmpName()+"  "+"Salary: "+emp.getSal());
					break;
				}	
			}
			
			if(requiredID==0) {
				throw new EmployeeNotFoundException("Employee Not Found");
			}
			
			
		} catch (EmployeeNotFoundException e) {
			System.out.println("Employee Not Found with ID: "+employeeID);
			e.printStackTrace();
		}

	}

}
