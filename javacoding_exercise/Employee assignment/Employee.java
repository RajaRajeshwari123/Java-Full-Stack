package javacoding_exercise.numbers;

public class Employee {
	private int empID;
	private String empName;	
	private String empCity;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String empName, String empCity) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empCity = empCity;
	}
	public int getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empCity=" + empCity + "]";
	}

}
