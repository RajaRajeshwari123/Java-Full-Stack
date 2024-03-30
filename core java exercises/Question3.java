package CorejavaExercises.ass1;

public class Question3 {
	public Question3() {
		this(0);
		System.out.println("A");
	}
public Question3(int k) {
	this(0, 0);
	System.out.println("B");
	}
public Question3(int k, int m) {
	System.out.println("C");
	}

public static void main(String[] args){
	int k = 5, j = 6;
	Question3 a = new Question3();
	Question3 b = new Question3(k*j);
	Question3 c = new Question3(k,j);
}
}

