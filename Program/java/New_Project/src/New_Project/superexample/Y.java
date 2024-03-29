package New_Project.superexample;

public class Y extends X{
	int y;
	public Y() {	
	System.out.println("Inside Y class constuctor");
	}
//	using this() to in constructor
	public Y(int y) {
		this();
		this.y=y;
	}

}
