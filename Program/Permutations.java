package New_Project.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Permutations {
 
    public static List<String> findPermutations(String s) {
        List<String> result = new ArrayList<>();
        permutations("", s, result);
        return result;
    }
 
    private static void permutations(String prefix, String suffix, List<String> result) {
        int n = suffix.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, n), result);
            }
        }
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Input here ---> ");
    	String input = sc.nextLine();
    	sc.close();
    	List<String> permutations = findPermutations(input);
        System.out.println("Permutations of " + input + ": ");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}
