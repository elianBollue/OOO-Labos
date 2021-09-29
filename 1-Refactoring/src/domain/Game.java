package domain;

public class Game extends Product {
    public Game(String title,String id){
        super(title,id,"G");
    }

    public double getPrice(int days){
        return days * 3;
    }
}
