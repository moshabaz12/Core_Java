package account;

class Acccount {
    private String accountHolder; // encapsulation
    private double balance;

    public String getAccountHolde() {
        return accountHolder;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You have deposited " + amount + " rs and now balance is " + balance + " rs.");
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("You have withdrawn " + amount + " rs and now balance is " + balance + " rs.");
    }

    public void setaccountHolde(String accountHolde) {
        this.accountHolder = accountHolde;
    }

    public double getBalancee() {
        return balance;
    }

    public void setBalancee(double balance) {
        this.balance = balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Acccount acccount = new Acccount();
      
        acccount.setaccountHolde("murshid");
        acccount.deposit(1000);
        acccount.withdraw(500);

        System.out.println("Final balance: " + acccount.getBalancee());
    }
}
