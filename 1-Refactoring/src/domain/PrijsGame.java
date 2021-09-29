package domain;

public class PrijsGame implements PrijsBerekeningsMethode{
    public PrijsGame(){}
    @Override
    public double getPrice(int days) {
        return days*3;
    }
}
