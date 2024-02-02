public class App {
    public static void main(String[] args) throws Exception {
        BankAccount ba1 = new BankAccount("Denny", 200.00);
        BankAccount ba2 = new BankAccount("Derrick", 100.00);
        BankAccount ba3 = new BankAccount("Doris", 500.00);
        BankAccount ba4 = new BankAccount("Dylan");
        BankAccount ba5 = new BankAccount("Doreamon");

        ba1.toString();

        ba1.deposit(100);
        System.out.println(ba1.toString());
        ba2.closeAcc();
        System.out.println(ba2.toString());
        //ba2.deposit(50);
        //ba3.deposit(-100);
        //ba4.withdraw(10.00);
        ba5.deposit(100);
        System.out.println(ba5.toString());
        ba5.withdraw(50);
        System.out.println(ba5.toString());


        FixedDepositAccount fa1 = new FixedDepositAccount("Dionne", 10000);        
        fa1.withdraw(500);
        fa1.deposit(10000);
        System.out.println(fa1.getBalance());
        System.out.println(fa1);
        fa1.setInterest(5);
        System.out.println(fa1);
        //fa1.setInterest(6);
        fa1.setDuration(12);
        System.out.println(fa1.toString());
        fa1.setBalance(10);
        System.out.println(fa1.toString());
    }
}
