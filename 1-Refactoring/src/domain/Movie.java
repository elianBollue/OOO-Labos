package domain;

public class Movie extends Product {
    String title,id;

    public Movie(String title, String id){
        super(title,id,"M");
        this.title = title;
        this.id = id;
    }

    public double getPrice(int days){
        double price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
