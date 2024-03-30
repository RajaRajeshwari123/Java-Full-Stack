package CorejavaExercises.ass1;

import java.util.Arrays;
import java.util.Random;

public class Question4 {

	    public static void main(String[] args) {
	        int[] myArray = generateRandomArray(10, 1, 100);
	        System.out.println("Original array:");
	        displayArray(myArray);
	        Arrays.sort(myArray);
	        System.out.println("\nSorted array:");
	        displayArray(myArray);
	    }
	    public static int[] generateRandomArray(int size, int min, int max) {
	        int[] arr = new int[size];
	        Random rand = new Random();
	        for (int i = 0; i < size; i++) {
	            arr[i] = rand.nextInt(max - min + 1) + min;
	        }
	        return arr;
	    }
	    public static void displayArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}



