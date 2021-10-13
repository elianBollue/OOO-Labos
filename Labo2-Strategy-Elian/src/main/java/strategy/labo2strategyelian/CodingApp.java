package strategy.labo2strategyelian;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CodingApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Strategy");
        FlowPane root = new FlowPane();
        Label label = new Label("Vul in");
        TextField textField = new TextField();
        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(textField.getText());
            }
        });
        Button button = new Button("Codeer");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(textField.getText());
            }
        });
        root.getChildren().add(label);
        root.getChildren().add(textField);
        root.getChildren().add(button);
        stage.setScene(new Scene(root, 250, 40));
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
