package strategy.labo2strategyelian;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import strategy.labo2strategyelian.domain.*;

public class CodingApp extends Application {
   // private final CodeStrategyFactory codefactory = new CodeStrategyFactory();
   CodingContext context = new CodingContext();
    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Strategy");
        GridPane root = new GridPane();
        root.setPadding(new Insets(5, 5, 5, 5));
        root.setVgap(10);
        root.setHgap(10);
        Label label = new Label("Vul in");
        Label resultlabel = new Label();
        TextField textField = new TextField();
        ComboBox combobox = new ComboBox();
        ObservableList<String> codes = FXCollections.observableList(context.getCodeLijst());
        combobox.setItems(codes);
        combobox.setPromptText("Kies een codeercode");

        combobox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               String selectie = combobox.getValue().toString();
                CodingStrategy codingStrategy = CodeStrategyFactory.createCodeClass(selectie);
                codingStrategy.setCodingContext(context);
                context.setCodingStrategy(codingStrategy);
            }
        });

        textField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionevent) {
                context.setTekst(textField.getText());
            }

        });
        Button button = new Button("Codeer");
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                context.setTekst(textField.getText());
                String result = "Dit is de gecodeerde tekst: "+ context.codeer();
                resultlabel.setText(result);
            }
        });

        Button decodeer = new Button("Decodeer");
        decodeer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                context.setTekst(textField.getText());
                String gedecodeerdeTekst = "Dit was het origineel: "+context.decodeer();
                resultlabel.setText(gedecodeerdeTekst);

            }
        });



        root.add(label,0,0);
        root.add(textField,0,1);
        root.add(combobox,0,2);
        root.add(button,0,3);
        root.add(decodeer,2,3);
        root.add(resultlabel,0,4);

        stage.setScene(new Scene(root, 800, 500));
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }

}
