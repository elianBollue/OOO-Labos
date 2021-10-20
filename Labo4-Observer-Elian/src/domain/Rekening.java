package domain;

public class Rekening {
    private int nummer;
    private double saldo;

    public Rekening(int nummer, double saldo){
        setNummer(nummer);
        setSaldo(saldo);
    }

    private void setNummer(int nummer){
        this.nummer = nummer;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNummer(){
        return this.nummer;
    }
}
