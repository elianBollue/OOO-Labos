package domain;

import javax.swing.*;

public abstract class Product {
    private String title,id,type;

    public Product(String title,String id, String type) {
        this.title=title; //JOptionPane.showInputDialog("Enter the title:");
        this.id = id; // JOptionPane.showInputDialog("Enter the id:");
        this.type = type; //JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
    }
    public String getId() {
        return id;
    }

    public double getPrice(int days) {
        double price = 0;
        if(this.type.equals("M")){
            price = 5;
            int daysLeft = days - 3;
            if (daysLeft > 0) {
                price += (daysLeft * 2);
            }
        } else if(this.type.equals("G")){
            price = days * 3;
        }
        return price;
    }

    public String toString() {
        return title+"\n" + id + "\n" + type;
    }

}
