package domain;

public class Auditor implements BankObserver{
    public Auditor(Bank bank){
        bank.addObserver();
    }

    @Override
    public void update(BankEvent e, BankAccount ba, int depositamount) {

    }
}
