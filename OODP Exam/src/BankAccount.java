public class BankAccount {
    private String accountNumber;
    private double balance;
    private Logger logger = Logger.getInstance();

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        logger.log("Deposited " + amount + " into " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            logger.log("Withdrew " + amount + " from " + accountNumber);
        } else {
            logger.log("Withdrawal failed for " + accountNumber + " due to insufficient funds");
        }
    }
}
