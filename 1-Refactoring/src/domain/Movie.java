package domain;

public class Movie extends Product {

    public Movie(String title){
        super(title,"M",new PrijsMovie());
    }

    public double getPrice(int days){
        return super.getPrice(days);
    }
}
