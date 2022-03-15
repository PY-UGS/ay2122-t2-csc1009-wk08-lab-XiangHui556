package lab8;
import java.util.Scanner;

public class CheckingAccount {
    private double balance;
    private int accountNumber;

    public CheckingAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if((this.balance - amount) < 0){
            double moneyShort = amount - this.balance;
            throw new InsufficientFundsException(String. format("Sorry, but your account is short by: $ %.2f", moneyShort));
        }
        else{
            this.balance -= amount;
        }
    }

    public int getNumber(){return accountNumber;}

    public double getBalance() {
        return balance;
    }

}
