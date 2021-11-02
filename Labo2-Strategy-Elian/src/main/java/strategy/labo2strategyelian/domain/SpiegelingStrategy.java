package strategy.labo2strategyelian.domain;

public class SpiegelingStrategy implements CodingStrategy {
    private CodingContext codingContext;

    public SpiegelingStrategy() { }

    public SpiegelingStrategy(CodingContext codingContext){
        this.codingContext = codingContext;
    }

    public void setCodingContext(CodingContext context) {
        this.codingContext=context;
    }

    public String codeer() {
        String tekst = codingContext.getTekst();
        char[] tekstArray = tekst.toCharArray();
        String nieuweString = "";
        for(int i=0;i<tekst.length();i++){
            nieuweString += tekstArray[tekst.length()-1-i];
        }
        return nieuweString;
    }

    public String decodeer() {
        return codeer();
    }
}