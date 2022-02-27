public class Dato {
    private double amount = 0 ;
    private String variablex = "";
    public Dato(String variablex, double amount){
        this.amount = amount;
        this.variablex = variablex;
    }
    public String getVariablex() {
            return variablex;
        }
    public double getAmount(){
        return amount;
    }
}
