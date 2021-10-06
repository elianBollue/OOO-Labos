package domain;

public class CaesarStrategy implements CodingStrategy{
    private CodingContext codingContext;

    public CaesarStrategy(CodingContext codingContext){
        this.codingContext = codingContext;
    }

    public String codeer(){
        return "epic";
    }

    public String decodeer(){
        return "epic";
    }
}
