import java.util.*;
import java.lang.*;

public class ThirdLargestElement {
    public static void main(String args[]) {

        int arr[] = { 1, 14, 2, 16, 10, 20 };

        int largestNum = arr[0];
        int SecondLargestElement = -1;
        int ThirdLargestElement = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                ThirdLargestElement = SecondLargestElement;
                SecondLargestElement = largestNum;
                largestNum = arr[i];
                // ThirdLargestElement = SecondLargestElement;
            }
        }
        System.out.println(ThirdLargestElement);
    }
}
