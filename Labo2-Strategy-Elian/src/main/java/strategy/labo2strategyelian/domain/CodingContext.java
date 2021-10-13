package strategy.labo2strategyelian.domain;

public class CodingContext {
    private String tekst;
    private CodingStrategy codingStrategy;

    public CodingContext(String tekst){
        this.tekst = tekst;
    }

    protected void setCodingStrategy(CodingStrategy codingStrategy){
        this.codingStrategy = codingStrategy;
    }

    public String getTekst(){
        return tekst;
    }

    public String codeer(){
        return null;
    }
    public String decodeer() {
        return null;
    }
}