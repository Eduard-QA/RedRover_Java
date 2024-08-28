package Lessons;

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
        if (a<100 && b>10){
            System.out.println(  "если а меньше 100 и б больше 10 ");
        }
    }


}
