package domain;

import javax.swing.*;

public abstract class Product {
    private String title,type;
    private PrijsBerekeningsMethode prijsBerekeningsMethode;

    public Product(String title, String type, PrijsBerekeningsMethode prijsBerekeningsMethode) {
        this.title=title;
        this.type = type;
        this.prijsBerekeningsMethode = prijsBerekeningsMethode;
    }
    public String getTitle() {
        return this.title;
    }

    public double getPrice(int days) {
        return this.prijsBerekeningsMethode.getPrice(days);
    }

   // public String toString() {
       // return title+"\n" + id + "\n" + type;
   // }

}
