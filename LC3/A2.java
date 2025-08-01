/*Activity 2:
 Design an algorithm to accept 20 integer elements for an array and print the maximum 3 and minimum 3 
 elements from the array.
 Note: Sorting of array elements is not expected as part of this activity.*/
 import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];

        System.out.println("Enter 20 integer elements:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max values
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        // Initialize min values
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

        for (int num : arr) {
            // Check for max values
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Check for min values
            if (num < min1) {
                min3 = min2;
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min3 = min2;
                min2 = num;
            } else if (num < min3) {
                min3 = num;
            }
        }

        System.out.println("\nTop 3 Maximum Elements: " + max1 + ", " + max2 + ", " + max3);
        System.out.println("Top 3 Minimum Elements: " + min1 + ", " + min2 + ", " + min3);
    }
}

