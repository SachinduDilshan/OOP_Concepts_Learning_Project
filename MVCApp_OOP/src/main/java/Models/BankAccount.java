package Models;

public abstract class BankAccount {
    private String ownerName;
    private int accountNo;
    private float balance;
    public BankAccount( String ownerName,int accountNo,float balance)//method overloading
    {
        this.ownerName=ownerName;
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public BankAccount( ) //method overloading
    {
        this.ownerName=null;
        this.accountNo=0;
        this.balance=0.0f;
    }
    public String printAccount()
    {
        return this.ownerName+" "+this.accountNo+" ("+this.balance+" )";
    }
    public String getOwnerName()
    {
        return this.ownerName;
    }
    public int getAccountNo()
    {
        return this.accountNo;
    }
    public float getBalance()
    {
        return this.balance;        
    }
    public void setOwnerName(String name)
    {
        this.ownerName=name;
    }
     public void setAccountNo(int no)
    {
        this.accountNo=no;
    }
      public void setBalance(float bal)
    {
        this.balance=bal;
    }
    
}
