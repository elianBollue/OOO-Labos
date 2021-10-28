package domain;

public interface Subject {
    void addObserver(BankObserver observer, BankEvent event);
    void removeObserver(BankObserver observer);
    void notifyObserver(BankEvent e, BankAccount ba, int depositamt);
}
