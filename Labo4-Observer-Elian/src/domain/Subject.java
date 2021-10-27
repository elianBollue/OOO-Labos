package domain;

public interface Subject {
    void addObserver(Observer observer, BankEvent event);
    void removeObserver(Observer observer);
    void notifyObserver();
}
