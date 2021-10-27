package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank implements Subject{
    private HashMap<String,Rekening> rekeningen;
    private HashMap<BankEvent, List<Observer>> observers;

    public Bank(){
        rekeningen = new HashMap<>();
        observers = new HashMap<>();
    }

    public void voegRekeningToe(String rekeningNummer, double saldo){
        Rekening rekening = new Rekening(rekeningNummer, saldo);
        rekeningen.put(rekening.getNummer(), rekening);
    }

    public void voegRekeningToe(Rekening rekening){
        rekeningen.put(rekening.getNummer(), rekening);
    }

    @Override
    public void addObserver(Observer observer, BankEvent event) {
        if (observers.get(event) == null){
            observers.put(event, new ArrayList<>());
        }
        observers.get(event).add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }
}
