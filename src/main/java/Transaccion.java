import java.time.LocalDate;

public class Transaccion {
    private LocalDate date;
    private Dato Dato;
    private double balance;
    private double withdraw = 0;
    private long account;

    public Transaccion( LocalDate date, double balance, String dato, double amount) {
        this.date = date;
        this.balance = balance;
        this.Dato = new Dato(dato,amount);
    }
    public Transaccion( LocalDate date, double amount, long account, double balance) {
        this.date = date;
        this.balance = balance;
        this.account = account;
        this.Dato = new Dato("transfer", amount);
    }

    public LocalDate getDate() {
        return date;
    }
    public double getBalance(){
        return balance;
    }

    public Dato getDato() {
        return Dato;
    }
}