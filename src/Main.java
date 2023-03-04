public class Main {

    public static void main(String[] args) {
       BankAccount debitAccount = new BankAccount("Diana", 500) ;
       System.out.println(debitAccount.withdraw(500)?"withdrawal successful":"withdrawal failed, not enough money");
       System.out.println(debitAccount.payIn(1000)?"Balance updated":"Error, Please Contact the Admin");
       System.out.println(debitAccount.withdraw(2000)?"withdrawal successful":"withdrawal failed, not enough money");

        System.out.println(" Bank Account Information ");
       System.out.println("Bank Account Owner: " + debitAccount.getOwnerName());
       System.out.println(("Current Balance: "+ debitAccount.getBalance()));
    }

}