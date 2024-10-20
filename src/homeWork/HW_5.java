package homeWork;

public class HW_5 {
    public static void main(String[] args) {
        sumArr();
        maxArrayValue();
        minArrayValue();
        getAverageArray();
        sumDoubleArray();
        maxDoubleArray();
        minDoubleArray();
        countElementsDoubleArr();
    }

    public static void sumArr() {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int summa = 0;
        for (int ar : array) {
            summa += ar;
        }
        System.out.println("The sum of elements in the array is: " + summa);
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

    public static void getAverageArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("The average of the array is: " + (sum / array.length));
    }

    public static void sumDoubleArray() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sumArray = 0;
        for (int[] k : array) {
            int sum = 0;
            for (int j : k) {
                sum += j;
            }
            sumArray += sum;
        }
        System.out.println("The sum of all elements in the double array is: " + sumArray);
    }

    public static void maxDoubleArray() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxValArray = Integer.MIN_VALUE;
        for (int[] k : array) {
            int maxValue = Integer.MIN_VALUE;
            for (int j : k) {
                if (j > maxValue) {
                    maxValue = j;
                }
            }
            if (maxValue > maxValArray) {
                maxValArray = maxValue;
            }
        }
        System.out.println("The maximum value in the double array is: " + maxValArray);
    }

    public static void minDoubleArray() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int minValArray = Integer.MAX_VALUE;
        for (int[] k : array) {
            int minValue = Integer.MAX_VALUE;
            for (int j : k) {
                if (j < minValue) {
                    minValue = j;
                }
            }
            if (minValue < minValArray) {
                minValArray = minValue;
            }
        }
        System.out.println("The minimum value in the double array is: " + minValArray);
    }

    public static void countElementsDoubleArr() {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int countArr = 0;
        for (int[] k : array) {
            int count = 0;
            for (int j : k) {
                count++;
            }
            countArr += count;
        }
        System.out.println("The count of all elements in the double array is: " + countArr);
    }
}
