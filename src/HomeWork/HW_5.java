package HomeWork;

public class HW_5 {
    public static void main(String[] args) {
        sumArr();
        maxArrayValue();
        minArrayValue();
    }

    public static void sumArr() {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int summa = 0;
        for (int ar : array) {
            summa += ar;
        }
        System.out.println("Summa elements of array is: " + summa);
    }

    public static void maxArrayValue() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxValue = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        System.out.println("The maximum value in the array is: " + maxValue);
    }

    public static void minArrayValue() {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minValue = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < minValue) {
                minValue = j;
            }
        }
        System.out.println("The minimum value in the array is: " + minValue);
    }

}
