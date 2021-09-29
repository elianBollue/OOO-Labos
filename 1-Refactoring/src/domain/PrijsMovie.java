package domain;

public class PrijsMovie implements PrijsBerekeningsMethode {
    public PrijsMovie(){}

    @Override
    public double berekenPrijs(int days) {
        double price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }
}
