package strategy.labo2strategyelian.domain;

public interface CodingStrategy {
    String codeer();
    String decodeer();
    void setCodingContext(CodingContext context);
}