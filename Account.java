public class Account {
    private int balance = 0;
    
    Account(int balance) {
        this.balance = balance;
    }
    
    public synchronized void deposit(int amount) {
        balance = balance + amount;
    }
    
    public synchronized void withdraw(int amount) {
        balance = balance - amount;
    }
    
    public synchronized int getBalance() {
        return balance;
    }
}