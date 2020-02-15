public class Account extends Object {

    private String name;
    private double balance;


    public Account(String  name , double balance) {
        this.name = name;

        if(balance > 0.0)
        {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount) {
        this.balance = this.balance + depositAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " : " + balance;
    }
}
