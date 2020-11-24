package com.cg.esi.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EISDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		EmployeeService emp1 = new EmployeeServiceImpl(); 
		emp1.getEmployeeDetails(emp);
		System.out.println("Insurance Scheme : "+emp1.findInsuranceScheme(emp));
		emp1.showEmployeeDetails(emp);
	}

}
