import java.lang.*;

public class PushZeroToEnd {
    public static boolean CheckIfSorted(int[] numbers) {
        if (numbers.length <= 1) {
            System.out.println("Array is too small to determine sorting.");
            return false; // Consider empty or single-element arrays as "not sorted"
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 5, 3, 5, 7 };
        if (CheckIfSorted(numbers)) {
            System.out.println("array is sorted");
        } else {
            System.out.println("array is not sorted");
        }

    }

}
