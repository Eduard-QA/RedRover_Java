package HomeWork;

import java.util.Arrays;

public class Hw_4 {
    public static void main(String[] args) {
        reversArray();
    }

    public static void reversArray() {
        int arr[] = {7, 4, 8, 9, 2, 1, 25, 98, 12, 0};
        int arr2[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
