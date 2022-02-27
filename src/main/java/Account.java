import java.time.LocalDate;
import java.util.ArrayList;

public class Account {

    private double saldoActual = 0;
    private ArrayList<Transaccion> Transacciones = new ArrayList<>();

   /// private double transferir = 0;

    void deposit(int amount, String date) {
        LocalDate Fecha = Dia.format(date);
        saldoActual = saldoActual + amount;
        Transacciones.add(new Transaccion(saldoActual, "transferencia", amount, Fecha));

    }

    void withdraw(int amount, String date){
        LocalDate Fecha = Dia.format(date);
        saldoActual = saldoActual - amount;
        Transacciones.add(new Transaccion(saldoActual, "transferencia", amount, Fecha));


    }

    public void transfer(int amount, String date) {
        LocalDate Fecha = Dia.format(date);
        Transacciones.add(new Transaccion(saldoActual, "transferencia", amount, Fecha));
    }

    /* OBJETO TRANSACCIONES - LO QUE CADA TRANSACCION DEBE TENER
    *  DATE: fecha
    *  CREDIT: ingresos
    *  DEBIT: egresos
    *  BALANCE: saldo actual
    * */

    // TODO: 27/02/2022 SIN USAR 
    double tranferir(int amount){
        saldoActual = saldoActual - amount;
        return saldoActual;

    }

    void printStatements() {
        for (Transaccion movimiento:this.Transacciones){
            System.out.println("------------------------------------------");
            System.out.println("Fecha: " + movimiento.getDate());
            System.out.println("Credito: " ); //PLATA QUE SE RETIRA
            System.out.println("Debito: " ); //PLATA QUE SE INGRESA
            System.out.println("Balance: " + saldoActual);

            System.out.println("------------------------------------------");

        }

    }

}
