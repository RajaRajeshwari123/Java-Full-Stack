package New_Project.superexample;

public class Manager extends Employee{
	private String deptname;

	Manager(int employeeno, String name, String deptname ){
			super(employeeno, name);
			// parent class 2-arg constructor is called 
		
			System.out.println(" Manager 3-arg Constructor Begins");
			this.deptname = deptname;
			System.out.println(" Manager 3-arg Constructor Ends");
	     }
	
	void display()	{
		super.display();
		// parent class display() function is called 
		System.out.println(" Deptname = "+deptname);
	}

}
	

