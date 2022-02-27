import java.beans.Statement;

// TODO: 27/02/2022 Depósito y retiro -- COMPLETED
//TODO Transferir
//TODO Estado de cuenta (fecha, monto, saldo)
//TODO Impresión de estados de cuenta
//TODO Filtros de estados de cuenta (solo depósitos, retiro, fecha)


public class StartApp {

    public static void main(String[] args) {
        Account account = new Account();

        account.deposit((1000), "10/01/2021");
        account.deposit((2000), "13/01/2021");
        account.withdraw(110, "14-01-2021");


        //    System.out.println(account.deposit(0, "10/01/2021"));
        account.printStatements();

    }

}
