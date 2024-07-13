package Controllers;
import Models.SavingsAccount;
public class AccountController {
    SavingsAccount objSavings;
    public SavingsAccount addSavingsAccount(float interestRate, boolean flag, String ownerName,
            int accountNo, float balance)
    {
        objSavings=new SavingsAccount(interestRate,flag,ownerName,accountNo,balance);
        return objSavings;
    }
}
