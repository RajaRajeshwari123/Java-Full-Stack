package New_Project.multilevelexample;
public class Demo {

	public static void main(String[] args) {
		System.out.println(" Employee object e is created  ");
		Employee e = new Employee();
		System.out.println("  Manager object m is created  ");
		Manager m = new Manager();
		System.out.println("  Director object d is created  ");
		Director d = new Director();
		System.out.println("  salary(e) is called ; ");
		salary(e);
		System.out.println("  salary(m) is called ; ");
		salary(m);
		System.out.println("  salary(d) is called ; ");
		salary(d);
	} // end of main

	public static void salary(Object obj) {
		// Here, Object obj will accept the following:
		// Object class objects
		// Employee class objects
		// Manager class objects
		// Director class objects

		// The following block decides what type of object is passed to this function.
		// We test whether the object obj is really an instance of Director class or
		// Manager class or Employee class.
		if (obj instanceof Director)
			System.out.println(" Director Salary 30000$");
		else if (obj instanceof Manager)
			System.out.println(" Manager Salary 20000$");
		else if (obj instanceof Employee)
			System.out.println(" Employee Salary 10000$");
		else
			System.out.println(" INVALID");
	}
}