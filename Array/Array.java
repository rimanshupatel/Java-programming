// 1. printing the array 

import java.util.*;
import java.lang.*;

public class Array {

    public static void main(String args[]) {
        // 1st type :
        // type ArrayName[] = new type[size];

        int marks[] = new int[3];

        // input for Array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number :");
        marks[0] = sc.nextInt();
        System.out.println("Enter your 2nd number :");
        marks[1] = sc.nextInt();
        System.out.println("Enter your 3rd number :");
        marks[2] = sc.nextInt();

        System.out.println(marks[0] + " " + marks[1] + " " + marks[2]);

        // 2nd type
        // we can also define an arry like this:
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }

    }
}
