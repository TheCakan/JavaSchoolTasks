public class SBanking {

    public static void main(String[] args) {
        Person johnP = new Person("John"),
                maryP = new Person("Mary");
        BankCustomer john = new BankCustomer(johnP);
        BankCustomer mary = new BankCustomer(maryP);

        john.deposit(1000);
        mary.deposit(2000);
        mary.deposit(-100);
        john.transfer(mary, 1500);
        john.transfer(mary,  500);
        mary.withdraw(3000);
        mary.withdraw(1000);

        System.out.println();
        System.out.println(john);
        System.out.println(mary);

        Account.setInterestRate(4.5);
        john.addInterest();
        mary.addInterest();

        System.out.println();
        System.out.println(john);
        System.out.println(mary);
    }
}