package domain;

public class Rekening {
    private String nummer;
    private double saldo;

    public Rekening(String nummer, double saldo){
        setNummer(nummer);
        setSaldo(saldo);
    }

    private void setNummer(String nummer){
        this.nummer = nummer;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getNummer(){
        return this.nummer;
    }
}
