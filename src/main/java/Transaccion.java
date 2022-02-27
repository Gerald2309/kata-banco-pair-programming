import java.time.LocalDate;
public class Transaccion {
    private LocalDate date;

    private double balance;
    private double withdraw = 0;
   // private deposit variableActual;
    private long account;

    public Transaccion( double balance, String operation, double amount, LocalDate date) {
        this.date = date;
        this.balance = balance;
    }

    public Transaccion( double amount, long account, double balance, LocalDate date) {
        this.date = date;
        this.balance = balance;
        this.account = account;
    }

    public LocalDate getDate() {
        return date;
    }

   /* public double getDeposit() {
        return deposit;
    }*/
}