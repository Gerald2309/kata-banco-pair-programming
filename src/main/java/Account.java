import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
    private double saldoActual = 0;
    private ArrayList<Transaccion> Transacciones = new ArrayList<>();
    void deposit(int amount, String date) {
        LocalDate Fecha = Dia.format(date);

        this.saldoActual += amount;
        Transacciones.add(new Transaccion(Fecha, saldoActual, "Ingreso", amount));

    }
    void withdraw(int amount, String date){
        LocalDate Fecha = Dia.format(date);
        saldoActual = saldoActual - amount;
        Transacciones.add(new Transaccion(Fecha, saldoActual, "Egresos", amount));


    }
    public void transfer(int amount, String date) {
        LocalDate Fecha = Dia.format(date);
        Transacciones.add(new Transaccion(Fecha, saldoActual, "transferencia", amount));
    }
    double transferir(int amount){
        saldoActual = saldoActual - amount;
        return saldoActual;

    }
    void printStatements() {
        for (Transaccion movimiento:this.Transacciones){
            System.out.println("------------------------------------------");
            System.out.println("Fecha: " + movimiento.getDate());
            System.out.println("Cantidad: "+movimiento.getDato().getAmount());
            System.out.println("Operación realizada: "+movimiento.getDato().getVariablex());
            System.out.println("Balance: " +movimiento.getBalance());

            System.out.println("------------------------------------------");

        }
    }
}
