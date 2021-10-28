package domain;

public interface BankObserver {
    void update(BankEvent e, BankAccount ba, int depositamount);
}
