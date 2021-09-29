package db;

import domain.Product;

import java.util.HashMap;

public class ShopDB {
    private LoadMethod loadmethod;
    private HashMap<Integer,Product> productlijst;

    public ShopDB(LoadMethod loadmethod){
        this.loadmethod = loadmethod;
        this.productlijst = new HashMap<>();
    }
}
