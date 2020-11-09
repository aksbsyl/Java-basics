package BankingSystem;

/**
 * Created by explore on 7/14/17.
 */
public class CurrentAccount extends Account{

    @Override
    public float getInterest() {
        return 6.0f;
    }

    @Override
    public double getInitialDeposit() {
        return 0;
    }
}
