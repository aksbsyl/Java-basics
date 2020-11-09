package BankingSystem;

/**
 * Created by explore on 7/14/17.
 */
public abstract class Account {
    private int accountId;
    private double amount;
    private int interest;
    private double initialDeposit;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract float getInterest();


    public abstract double getInitialDeposit();




}
