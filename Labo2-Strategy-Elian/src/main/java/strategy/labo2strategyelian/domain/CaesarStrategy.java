package strategy.labo2strategyelian.domain;

import java.util.ArrayList;
import java.util.Locale;

public class CaesarStrategy implements CodingStrategy{
    private CodingContext codingContext;
    private final static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private int offset  = 4;

    public CaesarStrategy(CodingContext codingContext){
        this.codingContext = codingContext;
    }

    public String codeer(){
        String string = "";
        String tekst = codingContext.getTekst().toLowerCase();
        char[] tekstArray = tekst.toCharArray();
        for(char c : tekstArray){
            if(inAlphabet(c)){
                int thisIndex = getIndexInAlphabet(c);
                int newIndex = thisIndex + offset;
                if(newIndex >= alphabet.length){
                    newIndex = newIndex - (alphabet.length-1);
                }
                string += alphabet[newIndex];
            } else{
                string += c;
            }
        }
        return string;
    }

    public String decodeer(){
        String string = "";
        String tekst = codingContext.getTekst().toLowerCase();
        char[] tekstArray = tekst.toCharArray();
        for(char c : tekstArray){
            if(inAlphabet(c)){
                int thisIndex = getIndexInAlphabet(c);
                int newIndex = thisIndex - offset;
                if(newIndex < 0){
                    newIndex = newIndex + (alphabet.length-1);
                }
                string += alphabet[newIndex];
            } else{
                string += c;
            }
        }
        return string;
    }

    private boolean inAlphabet(char letter){
        for(char c : alphabet){
            if(c == letter){
                return true;
            }
        }
        return false;
    }

    private int getIndexInAlphabet(char letter){
        int teller = 0;
        for(char c : alphabet){
            if(c == letter){
                return teller;
            }
            teller++;
        }
        throw new IllegalArgumentException("Not a letter!");
    }
}
