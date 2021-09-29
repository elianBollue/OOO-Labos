package domain;

public class Game extends Product {
    public Game(String title,String id){
        super(title,id,"G",new PrijsGame());
    }

    public double getPrice(int days){
        return super.getPrice(days);
    }
}
