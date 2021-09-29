package domain;

import javax.swing.*;

public abstract class Product {
    private String title,id,type;
    private PrijsBerekeningsMethode prijsBerekeningsMethode;

    public Product(String title,String id, String type, PrijsBerekeningsMethode prijsBerekeningsMethode) {
        this.title=title;
        this.id = id;
        this.type = type;
        this.prijsBerekeningsMethode = prijsBerekeningsMethode;
    }
    public String getId() {
        return id;
    }

    public double getPrice(int days) {
        return this.prijsBerekeningsMethode.berekenPrijs(days);
    }

    public String toString() {
        return title+"\n" + id + "\n" + type;
    }

}
