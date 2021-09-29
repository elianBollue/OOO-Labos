package ui;

import domain.Game;
import domain.Movie;
import domain.Shop;

import javax.swing.*;

import static domain.Shop.*;

public class ShopUI {
    private Shop shop;

    public ShopUI() {
        this.shop = new Shop();
    }


    public void start() {
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                addProduct();
            } else if (choice == 2) {
                showProduct(shop);
            } else if (choice == 3) {
                showPrice(shop);
            }
        }
    }

    public void addProduct() {
        String title = JOptionPane.showInputDialog("Enter the title:");
        String id = JOptionPane.showInputDialog("Enter the id:");
        String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
        //String prijsBerekeningsMethode = JOptionPane.showInputDialog("Prijs Berkenen volgens M for movie, G for Game");
        if (type.equals("M")) {
            Movie movie = new Movie(title, id);
            this.shop.addProduct(movie);
        } else {
            Game game = new Game(title, id);
            this.shop.addProduct(game);
        }
    }
}
