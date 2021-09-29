package App;

import db.LoadFromTxtFile;
import db.LoadMethod;
import ui.ShopUI;

public class ShopApp {
    private LoadMethod loadmethod = new LoadFromTxtFile();
    public static void main (String[] args) {
        new ShopUI(loadmethod).start();
    }

}
