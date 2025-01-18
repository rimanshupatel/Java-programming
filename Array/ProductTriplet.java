import java.util.*;

public class ProductTriplet {

    public static int MaxProduct(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements");
        }

        Arrays.sort(arr);
        int n = arr.length;

        int Product_1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int Product_2 = arr[0] * arr[1] * arr[n - 1];
        return Math.max(Product_1, Product_2);
    }

    public static void main(String args[]) {
        int arr[] = { -10, -15, -2, -4, 5, 9, 4, 8, 7 };
        System.out.println(MaxProduct(arr));
    }
};
