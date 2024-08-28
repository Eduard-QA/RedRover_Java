package HomeWork;

public class Hw_2 {
    public static void main(String[] arg) {
        System.out.println("Результат сложения 8 и 7 равен: " + summa(8, 7));
        System.out.println("Результат умножения 3 на 4 равен: " + multiplication(3, 4));
        System.out.println("Результат деления 35 на 5 равен: " + division(35, 5));
        System.out.println("Результат вычитания 15 из 14 равен: " + subtraction(14, 15));
    }

    public static int summa(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int division(int a, int b) {
        int result = a / b;
        return result;
    }

    public static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }
}

