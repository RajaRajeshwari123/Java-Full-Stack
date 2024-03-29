package New_Project.assignment;

public class MainSearch {
	public static void main(String[] args) {
        // Create an array of objects to search
        Object[] objects = {1, 2, 3, 4, 5, "Deepika", "OldMonk", "Modi"};
 
        // Create an instance of IntegerSearch
        AbstractSearch integerSearch = new IntegerSearch();
 
        // Create an instance of StringSearch
        AbstractSearch stringSearch = new StringSearch();
 
        // Perform search for integers
        System.out.println("I am Searching for integer 2:");
        boolean integerFound = integerSearch.Search(objects, 2);
        if (integerFound) {
            System.out.println("Integer 2 found.");
        } else {
            System.out.println("Integer 2 not found.");
        }
 
        // Perform search for strings
        System.out.println("\nSearching for string '':");
        boolean stringFound = stringSearch.Search(objects, "OldMonk");
        if (stringFound) {
            System.out.println("String 'OldMonk' found.");
        } else {
            System.out.println("String 'OldMonk' not found.");
        }
    }

}
