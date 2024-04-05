package javacoding_exercise.numbers;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<Employee> list = new ArrayList();

	void addEmployee(Employee emp) {
		list.add(emp);//list of employee from employee class it will take
	}

	Employee getEmployee(int empId) {     
		for(Employee e: list) {		//list of all employees here we are giving a variable to employee
			if(e.getEmpID()==empId) {//if getempid is equals to empid it will rwturn else null
				return e;
			}
		}
	
//	Employee getEmployee1(int empName) {     
//			for(Employee e1: list) {		 
//				if(e1.getEmpID()==empName) {
//					return e1;
//				}
//			}
		return null;
	}}
