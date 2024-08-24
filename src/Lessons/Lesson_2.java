package Lessons;

public class Lesson_2 {

    public static double summa(int x, int y){
        return x+y;
    }
public static void divisionByInt(int a, int b){
    System.out.println("Деление 27 на 6 без остатка: " + (a / b));
    System.out.println("Деление 27 на 6 с переводом в переменную double : " + (a*1.0 / b));

}
    public static void main(String[] arg){
        double result = summa(5, 58);
        System.out.println(result);

        System.out.println(1 + 2 + "a");
        System.out.println("b" + 1 + 2);
        System.out.println("" + 2 + 5);

        divisionByInt(27, 6);
    }

}
