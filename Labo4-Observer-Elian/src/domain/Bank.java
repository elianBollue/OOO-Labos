package domain;

import java.util.HashMap;

public class Bank implements Subject{
    private HashMap<Integer,Rekening> rekeningen = new HashMap<>();

    public void voegRekeningToe(Rekening rekening){
        rekeningen.put(rekening.getNummer(), rekening);
    }

    @Override
    public void addObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
