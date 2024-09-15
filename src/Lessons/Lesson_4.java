package Lessons;

import java.util.Arrays;

public class Lesson_4 {
    public static void main(String[] args) {

 //Массивы содержат переменные только одного типа ! ! !
        double[] julyRides = new double[4];   //  4 => длинна массива (количество элементов)
        double[] julyRides_1 = new double[]{15.0, 21.8, 18.5, 19.2}; // второй вариант записи
        double[] julyRides_2 = {15.0, 21.8, 18.5, 19.2};   //  третий вариант записи
        System.out.println(Arrays.toString(julyRides_2));

        double total = 0;
        for (int index = 0; index < julyRides_2.length; index++) {
            System.out.println(julyRides_2[index]);
            total = julyRides_2[index] + total;
            System.out.println("Сумма равна " + total);
        }
        System.out.println("Всего проехали " + total);

        int[] empty15 = new int[15];
        System.out.println(empty15.length);
        System.out.println(Arrays.toString(empty15));

        shortRides();
        longerRides();
        twoDimensionalArray();
        newMethod();
        newDoubleArray();
    }

    //Метод нахождения минимального значения в массиве
    public static void shortRides() {
        double[] augustRides = {18.8, 19.4, 24.2, 21.7, 30.7, 15.4};
        double min = Double.MAX_VALUE;
        for (int i = 0; i < augustRides.length; i++) {
            if (augustRides[i] < min) {
                min = augustRides[i];
            }
        }
        System.out.println(" Shortest ride:" + min);

    }

    //Метод нахождения максимального значения в массиве
    public static void longerRides() {
        double[] augustRides = {18.8, 19.4, 24.2, 21.7, 30.7, 15.4};
        double max = Double.MIN_VALUE;
        for (int i = 0; i < augustRides.length; i++) {
            if (augustRides[i] > max) {
                max = augustRides[i];
            }
        }
        System.out.println(" Longest ride:" + max);
    }

    //Двумерный массив
    public static void twoDimensionalArray() {
        double[][] allRides = {
                {18.8, 19.4, 24.2, 21.7, 30.7, 15.4},
                {15.0, 21.8, 18.5, 19.2}
        };
        System.out.println(Arrays.toString(allRides[0]));
        System.out.println(Arrays.toString(allRides[1]));
        System.out.println(allRides[0][3]);

        double max = Double.MIN_VALUE;
        for (int i = 0; i < allRides.length; i++) {
            for (int j = 0; j < allRides[i].length; j++) {
                if (allRides[i][j] > max) {
                    max = allRides[i][j];
                }
            }
        }
        System.out.println("Max track " + max);
    }

    public static void newMethod() {
        int[] ints = {1, 2, 3, 4, 5};
        for (int i : ints) {
            System.out.println("Значение элемента массива: " + i);
        }
    }

    public static void newDoubleArray() {
        double[][] allRides = {
                {18.8, 19.4, 24.2, 21.7, 30.7, 15.4},
                {15.0, 21.8, 18.5, 19.2}
        };
        double min = Double.MAX_VALUE;
        for (double[] inner : allRides) {
            for (double ride : inner) {
                if (ride < min) {
                    min = ride;
                }
            }
        }
        System.out.println("Минимальное расстояние: " + min);
    }
}
