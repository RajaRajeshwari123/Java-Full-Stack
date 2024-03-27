package New_Project.assignment;

public class SuperStudyC1 {
	public void X()
	{ System.out.println("I am in SuperStudy.X()"); }
 
	public static void main(String[] args)
	{
		SuperStudyChild ssc = new SuperStudyChild();
		ssc.X();
	}
}
 
class SuperStudyChild extends SuperStudyC1
{
	public void X()
	{
		super.X();
		System.out.println("I am in SuperStudyChild.X()");
	}
}


