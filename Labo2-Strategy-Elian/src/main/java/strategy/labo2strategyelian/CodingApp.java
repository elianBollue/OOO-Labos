import domain.CodingContext;
import domain.SpiegelingStrategy;

public class CodingApp {
    public static void main(String[] args){ //ik snap er de ballen van
        SpiegelingStrategy spiegelingStrategy = new SpiegelingStrategy(new CodingContext(".elyts cipE"));
        System.out.println(spiegelingStrategy.decodeer());
    }
}
