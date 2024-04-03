package workingdayeleven.genericscollectionassign;

import java.util.List;
import java.util.Vector;
 
public class ArithmeticOperations {
    public static <T extends Number> Number add(T t1, T t2) {
        return (t1.doubleValue() + t2.doubleValue());
    }
    public static <T extends Number> Number subtract(T t1, T t2) {
        return (t1.doubleValue() - t2.doubleValue());
    }
    public static <T extends Number> Number divide(T t1, T t2) {
        if (t2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (t1.doubleValue() / t2.doubleValue());
    }
    public static <T extends Number> Number multiple(T t1, T t2) {
        return (t1.doubleValue() * t2.doubleValue());
    }
    public static Number add(List<? extends Number> list) {
        double d = 0;
        for (int i = 0; i < list.size(); i++) {
            d += list.get(i).doubleValue();
        }
        return new Double(d);
    }
    public static Number sub(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d -= list.get(i).doubleValue();
        }
        return new Double(d);
    }
    public static Number div(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d /= list.get(i).doubleValue();
        }
		return new Double(d);
    }
    public static void dumpList(List<?> list) {
        System.out.println("List dump with unbounded wildcard:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static Number mul(List<? extends Number> list) {
        double d = list.get(0).doubleValue();
        for (int i = 1; i < list.size(); i++) {
            d *= list.get(i).doubleValue();
        }
        return new Double(d);
    }
 
    public static void main(String[] args) {
        // Adding 2 integers
        Integer i1 = new Integer(34), i2 = new Integer(43);
        System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
 
        // Subtracting 2 floats
        Float f1 = new Float(12.56), f2 = new Float(3.6778);
        System.out.println("Subtract with generic method: " + ArithmeticOperations.subtract(f1, f2));
 
        // Dividing 2 integers
        Integer i3 = new Integer(20), i4 = new Integer(5);
        System.out.println("Divide with generic method: " + ArithmeticOperations.divide(i3, i4));
        Integer i5 = new Integer(34), i6 = new Integer(43);
        System.out.println("Multiple with generic method: " + ArithmeticOperations.multiple(i5, i6));
 
        // Adding 2 integers through a list
        Vector<Number> l = new Vector<>();
        l.add(new Integer(34));
        l.add(new Integer(43));
        // Subtracting 2 integers through a list
        Vector<Number> s = new Vector<>();
        s.add(new Double(12.56));
        s.add(new Float(3.6778));
        //Dividing 2 integers through a list
        Vector<Number> d = new Vector<>();
        d.add(new Integer(20));
        d.add(new Integer(5));
        //multiple 2 integers through a list
        Vector<Number> m = new Vector<>();
        m.add(new Integer(34));
        m.add(new Integer(43));
        System.out.println("\nAdd with upper bounded wildcard: " + ArithmeticOperations.add(l));
        System.out.println("Sub with upper bounded wildcard: " + ArithmeticOperations.sub(s));
        System.out.println("Division with upper bounded wildcard: " + ArithmeticOperations.div(d));
        System.out.println("Multiple with upper bounded wildcard: " + ArithmeticOperations.mul(m));

        System.out.println(" ");
        // Dumping the list to the console.
        ArithmeticOperations.dumpList(l);
        ArithmeticOperations.dumpList(s);
        ArithmeticOperations.dumpList(d);
        ArithmeticOperations.dumpList(m);

    }
}