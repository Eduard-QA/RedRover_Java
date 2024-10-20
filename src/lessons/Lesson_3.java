package lessons;

public class Lesson_3 {
    public static void main(String[] args) {
        int a = 99;
        int b = 56;

        if (a < 100) {
            System.out.println(" a less than 100");
            System.out.println("остаток деления b на 5 равняется: " + b % 5);
            System.out.println("остаток деления b на 3 равняется: " + b % 3);
            System.out.println("остаток деления b на 6 равняется: " + b % 6);
            System.out.println("остаток деления b на 9 равняется: " + b % 9);
            System.out.println("остаток деления b на 10 равняется: " + b % 10);

        }
        if (a < 100 && b > 10) { //  && = операнд "И" = оба условия должны выполняться
            System.out.println("если 'a' меньше 100 и 'b' больше 10 ");
        }
        if (a > 100 || b > 10) { //  || = операнд "ИЛИ" = одно из условий должно выполняться
            System.out.println("если 'a' больше 100 или 'b' больше 10 ");
        }
        if (a == b) { //  ==  операнд РАВЕНСТВО переменные равны друг другу
            System.out.println("если 'a' равно 'b'  ");
        }
        if (a != b) { //  !=  операнд НЕРАВЕНСТВО переменные неравны друг другу
            System.out.println("если 'a' НЕравно 'b'  ");
        }
    }

    public static void switchTest() {
        int a = 100;
        if (a == 100) {
            System.out.println(" а == 100");
        } else {
            System.out.println(" а != 100");
        }
    }

}
