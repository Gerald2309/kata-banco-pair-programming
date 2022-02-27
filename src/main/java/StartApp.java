import java.beans.Statement;

public class StartApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000, "10/01/2021");
        account.deposit(2000, "13/01/2021");
        account.withdraw(110, "14-01-2021");
        account.printStatements();
    }
}
