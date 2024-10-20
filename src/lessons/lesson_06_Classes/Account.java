package lessons.lesson_06_Classes;

public class Account {
    double balance;

    void debit(double amount){
        if(balance<amount){
            System.out.println("Can't debit more than " + balance);
        }else {
            balance-=amount;
        }
    }
}
