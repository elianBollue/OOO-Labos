package App;

import db.LoadFromTxtFile;
import db.LoadMethod;
import ui.ShopUI;

public class ShopApp {
    private static LoadMethod loadmethod;

    public static void main (String[] args) {
        new ShopUI(loadmethod).start();
    }

}
