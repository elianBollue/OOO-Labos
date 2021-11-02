package strategy.labo2strategyelian.domain;

public enum CodeEnum {
    CAESAR ("Caesar","strategy.labo2strategyelian.domain.CaesarStrategy"),
    SPIEGELING ("Spiegeling", "strategy.labo2strategyelian.domain.SpiegelingStrategy"),
    CAES ("CAES","domain.CaesarStrategy");

    private final String omschrijving;
    private final String klasseNaam;

    CodeEnum(String omschrijving, String klasseNaam) {
        this.omschrijving=omschrijving;
        this.klasseNaam=klasseNaam;
    }

    public static CodeEnum fromString(String text) {
        for (CodeEnum c : CodeEnum.values()) {
            if (c.omschrijving.equalsIgnoreCase(text)) {
                return c;
            }
        }
        return null;
    }

    public String getOmschrijving() { return this.omschrijving;}
    public String getKlasseNaam() { return  this.klasseNaam;}

}
