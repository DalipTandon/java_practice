package Encapsulation;

public class BankAccount {
    private double balance;
    
    public double showBalance(){
        if(balance<0){
            return 0;
        }
        System.out.println("Operation successful");
        return balance;
    }
    public void deposite(double money){
        if(money<0){
            balance+=0;
            return;
        }
        balance+=money;
        System.out.println("Deposite Successful -> " + balance);
    }
    public double withdraw(double amount){
        if(amount<0){
            return 0;
        }
        if(amount>balance){
            System.out.println("Not sufficient balance");
            return 0;
        }
        balance-=amount;
        return amount;
    }
}
