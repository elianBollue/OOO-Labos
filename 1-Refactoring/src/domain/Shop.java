package domain;

import db.LoadMethod;
import db.ShopDB;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {
    private ShopDB products;

    public Shop(LoadMethod loadmethod)
    {
        this.products = new ShopDB(loadmethod);
    }



    public void addProduct(Product product) {
        this.products.addProduct(product);
    }

    public String showProduct(int id){
        if (products.getProductlijst().containsKey(id)) {
            Product p = (Product) products.getProductlijst().get(id);
            return p.getTitle();
        }
        return "No such product";
    }


    public double showPrice(int id, int days) {

        if (products.getProductlijst().containsKey(id)) {
            Product p = (Product) products.getProductlijst().get(id);
            return p.getPrice(days);
        }
        return 0;
    }

}
