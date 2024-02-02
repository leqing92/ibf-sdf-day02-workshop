public class FixedDepositAccount extends BankAccount {
    private double interest;
    private int duration;
    private boolean interestChanged = false;
    private boolean durationChanged = false;

    public FixedDepositAccount(String holderName, double balance){
        super(holderName, balance);
        this.interest = 3;
        this.duration = 6;
    }

    public FixedDepositAccount (String holderName, double balance, double interest){
        super(holderName, balance);
        this.interest = interest;
        this.duration = 6;
    }

    public FixedDepositAccount (String holderName, double balance, double interest, int duration){
        super(holderName, balance);
        this.interest = interest; 
        this.duration = duration;
    }
    
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        if(interestChanged){
            throw new IllegalArgumentException("Interest can only be changed once.");
        }
        else
        this.interest = interest;
        interestChanged = true;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(durationChanged){
            throw new IllegalArgumentException("Duration can only be changed once.");
        }
        else
        this.duration = duration;
        durationChanged = true;
    }

    @Override
    public void setBalance(double balance) {        
        System.err.println("Balance cannot be changed");;
    }

    @Override
    public double getBalance() {
        return (super.getBalance() * (1 + interest / 100)); //if this.getBalance then infinite loop
    }

    public void showBalance(){
        System.out.println("Account No: " + getAccountNo());
        System.out.println("Account Holder: " + getHolderName());
        System.out.println("Computed Balance with interest: " + (getBalance()));
    }

    @Override
    public void deposit(double amount) {
        System.err.println("Operations not allowed");
    }

    @Override
    public void withdraw(double amount) {
        System.err.println("Operations not allowed");
    } 

    @Override
    public String toString() {
        return "FixedDepositAccount [holderName=" + this.getHolderName() + ", accountNo=" + this.getAccountNo() + ", balance=" + this.getBalance() 
        + ", transactions=" + this. getTransactions() + ", isActive=" + this.getIsActive() + ", accountStart=" + this.getAccountStart() + ", accountEnd=" 
        + this.getAccountEnd() + ", interest=" + interest + ", duration=" + duration + ", interestChanged=" + interestChanged + ", durationChanged=" + durationChanged + "]";
    }    

}
