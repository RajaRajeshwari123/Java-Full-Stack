package New_Project.superexample;

public class Employee {
	private Integer employeeNo;
	private String employeeName;
		
	public Employee() {
		
		System.out.println(" Employee No-arg Constructor Begins");
		employeeNo =0; 
		employeeName= null ; 
		// the above assignments are unnecessary .. Why? 
		System.out.println(" Employee No-arg Constructor Ends");

	}


	public Employee(Integer employeeNo) {
		System.out.println(" Employee 1-arg Constructor Begins");
		this.employeeNo=employeeNo; 		
		this.employeeName= "UNKNOWN";
		System.out.println(" Employee 1-arg Constructor Ends");

	}


	public Employee(Integer employeeNo, String employeeName) {
		System.out.println(" Employee 2-arg Constructor Begins");
		this.employeeNo = employeeNo; 		
		this.employeeName  = employeeName;
		System.out.println(" Employee 2-arg Constructor Ends");
	}
	
	void display()		{
		System.out.println(" Employee Number = "+employeeNo);
		System.out.println(" Employee Name = "+employeeName);
	}
}