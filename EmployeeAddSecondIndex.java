package employee;

import java.util.ArrayList;

public class EmployeeAddSecondIndex {

	public static void main(String[] args) {
		ArrayList<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("Emp1",1,10000));
		empList.add(new Employee("Emp2",2,20000));
		empList.add(new Employee("Emp3",3,30000));
		empList.add(new Employee("Emp4",4,40000));
		empList.add(new Employee("Emp5",5,50000));
		
		empList.add(2, new Employee("Emp6",6,60000));
		
		
		for(int i=0;i<empList.size();i++) {
			Employee emp=empList.get(i);
			System.out.println("Emploee ID: "+emp.getEmpID()+"  "+"Name: "+emp.getEmpName()+"  "+"Salary: "+emp.getSal());
			
		}

	}
	
	

}
