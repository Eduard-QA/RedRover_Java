package Lessons.Lesson_06;

public class Main {
    public static void main(String[] args) {
        Account checking = new Account();
        checking.balance = 0;

        checking.balance += 100;
        System.out.println(checking.balance);

        checking.debit(20);
        System.out.println(checking.balance);

        checking.debit(100);
        System.out.println(checking.balance);

        Account saving = new Account();
        saving.balance = 1000;

        saving.debit(200);
        System.out.println(saving.balance);
        checking.debit(200);
        System.out.println(checking.balance);

    }
}
