package javacoding_exercise.numbers;

public class EmployeeMain {
	public static void main(String args[]) {
		Employee emp1=new Employee(1,"Rajeshwari","Hyderabad");
		Employee emp2=new Employee(2,"Thiru","Taramani");
		Employee emp3=new Employee(3,"Elita","Telangana");
		Employee emp4=new Employee(4,"Roshika","AP");
		Employee emp5=new Employee(5,"Srivalli","Mahabubnagar");
		Employee emp6=new Employee(6,"Ramesh","Rameshwaram");;
		
		AddEmployee Set=new AddEmployee();//object
		Set.addEmployee(emp1);
		Set.addEmployee(emp2);
		Set.addEmployee(emp3);
		Set.addEmployee(emp4);
		Set.addEmployee(emp5);
		Set.addEmployee(emp6);
		for(Employee e: Set.list) {//
			System.out.println(e);
			
		}System.out.println("----------------------------------------------------------");
//		System.out.println(Set.getEmployee("Srivalli"));
		System.out.println(Set.getEmployee(2));
	}

}
