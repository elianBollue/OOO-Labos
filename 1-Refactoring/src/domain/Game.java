package domain;

public class Game extends Product {
    public Game(String title){
        super(title,"G",new PrijsGame());
    }

    public double getPrice(int days){
        return super.getPrice(days);
    }
}
