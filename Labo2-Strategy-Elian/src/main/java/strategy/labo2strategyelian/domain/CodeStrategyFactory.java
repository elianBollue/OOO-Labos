package strategy.labo2strategyelian.domain;

public class CodeStrategyFactory {
    public static CodingStrategy createCodeClass(String code) {
        CodeEnum codeEnum = CodeEnum.fromString(code);
        String klassenaam = codeEnum.getKlasseNaam();
        CodingStrategy codingStrategy = null;
        try {
            Class dbClass = Class.forName(klassenaam);
            Object dbObject = dbClass.getConstructor().newInstance();
            codingStrategy = (CodingStrategy) dbObject;
        } catch (Exception e) {
            throw new RuntimeException("Deze code niet gevonden");
        }
        return codingStrategy;
    }
}
