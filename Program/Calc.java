package New_Project.assignment;

public class Calc {
	public static void main(String[] args) {
        Square square = new Square(4);
        System.out.println("Area of square: " + square.area());
        
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println("Area of rectangle: " + rectangle.area());
        
        Parallelogram parallelogram = new Parallelogram(5, 7);
        System.out.println("Area of parallelogram: " + parallelogram.area());
       
        
	}    
	

}
