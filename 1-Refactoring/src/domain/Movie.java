package domain;

public class Movie extends Product {
    String title,id;

    public Movie(String title, String id){
        super(title,id,"M");
        this.title = title;
        this.id = id;
    }

    public double getPrice(int days){
        return days * 3;
    }
}
