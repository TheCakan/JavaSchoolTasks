public class BankCustomer extends Person {
    public double balance;
    public BankCustomer(Person name){

        balance = 0.0;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        }
    }
    public void transfer(BankCustomer acc, double amount){
        if (this.balance < amount) {
            System.out.println("You don't have enough money");
        }else {
            this.balance -= amount;
            acc.balance += amount;
        }
    }

    public void addInterest() {

    }
}
