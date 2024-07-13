package Models;

public class User {
    
    private String UserName;
    private String Password;
    private String AccountType;

    public User(String UserName, String Password, String AccountType) {
        this.UserName = UserName;
        this.Password = Password;
        this.AccountType = AccountType;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getAccountType() {
        return AccountType;
    }
    
    
    
}
