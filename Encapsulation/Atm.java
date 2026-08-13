package Encapsulation;

public class Atm {
    public static void main(String[]args){
        BankAccount cust1=new BankAccount();
    //    double bal= cust1.showBalance();
    //    System.out.println(bal);
        cust1.deposite(30000);
      

       cust1.withdraw(1100);
            double bal= cust1.showBalance();
       System.out.println(bal);
    }
}
