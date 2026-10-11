package  OOPS;

class Account{
    String holderName;
    private int balance;

    Account(String a,int b)
    {
        holderName = a;
        balance = b;
    }

    void deposit(int amt)
    {
        balance = balance+amt;
    }

    void withdraw(int amt)
    {
        balance = balance-amt;
    }

    int getBalance()
    {
        return this.balance;
    }
    private void calculate_rewards()
    {
        System.out.println("Hello");
    }
}
public class Bank {
    public static void main(String[] args)
    {
//        Account a1 = new Account();
//        a1.holderName = "Rinkal";
//        a1.balance = 100;
//        a1.deposit(1000);
//
//        System.out.println(a1.getBalance());
//        a1.withdraw(500);
//        System.out.println(a1.getBalance());

        Account a2 = new Account("Jatin",1000);
        a2.deposit(100);
//        a2.calculate_reward()  we can not use it outside class it's private
        System.out.println(a2.getBalance());

    }

}
