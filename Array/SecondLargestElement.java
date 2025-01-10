import java.util.*;
import java.lang.*;

public class SecondLargestElement {
    public static void main(String args[]) {

        int[] arr = { 2, 9, 2, 10, 15, 5 }; // Example array

        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = arr[i]; // Update largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i]; // Update second largest
            }
        }

        if (secondLargest == -1) {
            System.out.println("there is no any second largest element");
        } else {
            System.out.println("second largest element :- " + secondLargest);
        }

    };
};
