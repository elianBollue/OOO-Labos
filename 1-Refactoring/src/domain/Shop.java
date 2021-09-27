package domain;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products;

    public Shop()
    {
        this.products = new ArrayList<Product>();
    }



    public static void addProduct(Shop shop) {
        Product newProduct = new Product();
        shop.products.add(newProduct);
    }

    public static void showProduct(Shop shop){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
        for(int i = 0; i < shop.products.size() && !found; i++)
        {
            if(shop.products.get(i).getId().equals(id))
            {
                idx = i;
                found = true;
            }
        }
        if(found)
        {
            JOptionPane.showMessageDialog(null, shop.products.get(idx).toString());
        }
    }

    public static void showPrice(Shop shop){
        String id = JOptionPane.showInputDialog("Enter the id:");
        int idx = -1;
        boolean found = false;
        for(int i = 0; i < shop.products.size() && !found; i++){
            if(shop.products.get(i).getId().equals(id)){
                idx = i;
                found = true;
            }
        }
        if(found){
            String daysString = JOptionPane.showInputDialog("Enter the number of days:");
            int days = Integer.parseInt(daysString);
            JOptionPane.showMessageDialog(null, shop.products.get(idx).getPrice(days));
        }
    }

}
