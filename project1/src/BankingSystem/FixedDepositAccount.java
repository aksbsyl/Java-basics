package BankingSystem;

/**
 * Created by explore on 7/14/17.
 */
public class FixedDepositAccount extends Account {
    @Override
    public float getInterest() {
        return (float) 12.0;
    }

    @Override
    public double getInitialDeposit() {
        return 100000.00;
    }
}
