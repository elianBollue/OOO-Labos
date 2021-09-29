package domain;

public class PrijsGame implements PrijsBerekeningsMethode{
    public PrijsGame(){}
    @Override
    public double berekenPrijs(int days) {
        return days*3;
    }
}
