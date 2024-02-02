import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
//import java.util.UUID;

public class BankAccount {
    
    private final String holderName;
    private final String accountNo;
    private double balance;
    private List<String> transactions;
    private Boolean isActive = true;
    private LocalDate accountStart;
    private LocalDate accountEnd;

    public BankAccount(String holderName) {
        //this.accountNo = UUID.randomUUID().toString();
        this.accountNo = generateRandomAccountNo();
        this.holderName = holderName;
        this.balance = 0.0;
        this.accountStart = LocalDate.now();

        if(transactions == null){
            this.transactions = new ArrayList<>();
        }
    }    

    public BankAccount(String holderName, double balance) {
        this.accountNo = generateRandomAccountNo();
        this.holderName = holderName;
        this.balance = balance;
        this.accountStart = LocalDate.now();

        if(transactions == null){
            this.transactions = new ArrayList<>();
        }
    }

    public String getHolderName() {
        return holderName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void closeAcc() {
        this.isActive = false;
        accountEnd = LocalDate.now();
    }

    public LocalDate getAccountStart() {
        return accountStart;
    }

    public LocalDate getAccountEnd() {
        return accountEnd;
    }

    public List<String> getTransactions() {
        return transactions;
    }    

    private String generateRandomAccountNo() {
        int startAsciNo = 66;
        int endAsciNo = 90;
        int accountNoLength = 10;
        
        Random rand = new Random();
        String accountNo = "";
        for (int i=0; i < accountNoLength; i++){
            int randomValue = startAsciNo + (int) (rand.nextFloat() * (endAsciNo - startAsciNo +1));
            accountNo = accountNo + (char) randomValue;            
        }
        return accountNo;
    }    
    
    public void deposit (double amount){
        if(isActive){
            if(amount > 0){
                this.balance = this.balance + amount;
                LocalDate currentDate = LocalDate.now();
                String log = "deposit " + String.valueOf(amount) + " on " + currentDate.toString();
                transactions.add(log); 
            }else{
                throw new IllegalArgumentException("You cannot make negative deposit.");
            }

        }else{
            throw new IllegalArgumentException("You cannot deposit to an inactive account.");
        }
    }

    public void withdraw (double amount){
        if(isActive){
            if(amount <= this.balance){
                this.balance = this.balance - amount;
                LocalDate currentDate = LocalDate.now();
                String log = "withdraw " + String.valueOf(amount) + " on " + currentDate.toString();
                transactions.add(log); 
            }else{
                throw new IllegalArgumentException("You cannot withdraw more that what you have.");
            }

        }else{
            throw new IllegalArgumentException("You cannot deposit to an inactive account.");
        }
    }

    // public LocalDate getDate(){
    //     LocalDate currentDate = LocalDate.now();
    //     return currentDate;
    // }

    @Override
    public String toString() {
        return "BankAccount [holderName=" + holderName + ", accountNo=" + accountNo + ", balance=" + balance
                + ", transactions=" + transactions + ", isActive=" + isActive + ", accountStart=" + accountStart
                + ", accountEnd=" + accountEnd + "]";
    }    

}
