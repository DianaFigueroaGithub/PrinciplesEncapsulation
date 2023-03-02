import jdk.nashorn.internal.ir.ReturnNode;

public class BankAccount {
    private String ownerName;
    private float balance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public BankAccount(String ownerName, float balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    //withdraw- to take money out of a bank account - withdrawal n.
    public boolean withdraw(float amountOut){
        boolean withdrawal = false;
        if (amountOut<= this.balance) {
            balance = balance - amountOut;
            withdrawal = true;
        }
        return withdrawal;
    }

    public boolean payIn (float amountIn){
        this.balance += amountIn;
        return true;
    }
}
