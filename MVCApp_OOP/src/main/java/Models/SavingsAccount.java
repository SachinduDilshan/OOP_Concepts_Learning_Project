package Models;

public class SavingsAccount extends BankAccount {

    private float interestRate;
    private boolean flag;
    private static int totalSavingsAccount = 0;

    public SavingsAccount(float interestRate, boolean flag, String ownerName, int accountNo, float balance) {
        super(ownerName, accountNo, balance);
        this.interestRate = interestRate;
        this.flag = flag;
        totalSavingsAccount++;
    }

    public SavingsAccount() {
        super();
        this.interestRate = 0.0f;
        this.flag = false;
        totalSavingsAccount++;
    }

    public float calculateTotalBalance() {
        float total = this.interestRate * super.getBalance() + super.getBalance();
        return total;
    }

    @Override
    public String printAccount() {
        return super.printAccount() + " " + this.interestRate + " " + this.flag;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static int getTotalSavingsAccount() {
        return totalSavingsAccount;
    }

}
