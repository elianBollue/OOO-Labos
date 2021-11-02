package strategy.labo2strategyelian.domain;

import java.util.ArrayList;
import java.util.List;

public class CodingContext {
    private String tekst;
    private CodingStrategy codingStrategy;

    public CodingContext(){};

    public CodingContext(String tekst){
        this.tekst = tekst;
    }

    public void setCodingStrategy(CodingStrategy codingStrategy){
        this.codingStrategy = codingStrategy;
    }

    public void setTekst(String tekst) {this.tekst = tekst;}

    public String getTekst(){
        return tekst;
    }

    public String codeer(){
        return codingStrategy.codeer();
        //throw new IllegalArgumentException("Geen coder beschikbaar");
    }
    public String decodeer() {
        return codingStrategy.decodeer();
        //throw new IllegalArgumentException("Geen decoder beschikbaar");
    }

    public List<String> getCodeLijst() {
        List<String> codelijst = new ArrayList<>();
        for (CodeEnum code: CodeEnum.values()) {
            codelijst.add(code.getOmschrijving());
        }
        return codelijst;
    }
}