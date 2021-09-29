package domain;

public class Movie extends Product {

    public Movie(String title, String id){
        super(title,id,"M",new PrijsMovie());
    }

    public double getPrice(int days){
        return super.getPrice(days);
    }
}
