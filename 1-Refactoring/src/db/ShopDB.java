package db;

import com.sun.source.util.Trees;
import domain.Product;

import java.util.*;

public class ShopDB {
    private static int AANTAL_PRODUCTEN = 0;
    private LoadMethod loadmethod;
    private HashMap<Integer, Product> productlijst;

    public ShopDB(LoadMethod loadmethod) {
        this.loadmethod = loadmethod;
        this.productlijst = new HashMap<>();
    }

    public HashMap getProductlijst() {
        return this.productlijst;
    }

    public void addProduct(Product product) {
        this.productlijst.put(this.getVolgendeIndex(), product);
    }

    private int getVolgendeIndex() {
        AANTAL_PRODUCTEN += 1;
        return AANTAL_PRODUCTEN;
    }
}

