package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank implements Subject{ //TODO Code aanpassen zodat het werkt zoals voorbeeld
    private HashMap<String,Rekening> rekeningen;

    private Map<BankEvent, List<BankObserver>> observers = new HashMap<>();
    private Map<Integer,BankAccount> accounts;
    private int nextacct;

    public Bank(Map<Integer,BankAccount> accounts, int n){
        this.accounts = accounts;
        nextacct = n;
        for(BankEvent e : BankEvent.values()){
            observers.put(e, new ArrayList<BankObserver>());
        }

        rekeningen = new HashMap<>();
    }

    public void voegRekeningToe(String rekeningNummer, double saldo){
        Rekening rekening = new Rekening(rekeningNummer, saldo);
        rekeningen.put(rekening.getNummer(), rekening);
    }

    public void voegRekeningToe(Rekening rekening){
        rekeningen.put(rekening.getNummer(), rekening);
    }

    @Override
    public void addObserver(BankObserver observer, BankEvent event) {
        if (observers.get(event) == null){
            observers.put(event, new ArrayList<>());
        }
        observers.get(event).add(observer);
    }

    @Override
    public void removeObserver(BankObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(BankEvent e, BankAccount ba, int depositamt) {
        for(BankObserver obs : observers.get(e)){
            obs.update(e, ba, depositamt);
        }
    }
}
