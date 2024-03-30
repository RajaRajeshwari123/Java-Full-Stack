package CorejavaExercises.ass1;

import java.util.Scanner;

public class RecursiveMin {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a;i++) {
        	arr[i] = sc.nextInt();
        }
        int min = findMin(arr, arr.length - 1);
        
        for(int ind=0;ind<arr.length;ind++) {
        	if(arr[ind]==min) {
        		System.out.println("The index of minimum value is: "+ind);
        	}
        }
    }
 
    public static int findMin(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            return Math.min(array[index], findMin(array, index - 1));
        }
    }
}



