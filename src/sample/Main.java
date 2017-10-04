package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Label label = new Label("Not clicked.");
        Button button = new Button("Click");

        Button button1 = new Button("Button 1");
        Button button2 = new Button("button2 ");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");

        button1.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");
        button2.setStyle("-fx-background-color: #00ff00");
        button3.setStyle("-fx-font-size: 2em;");
        button4.setStyle("-fx-text-fill: #0000ff");

        button.setOnAction(value -> {
            label.setText("Clicked!");
        });

        HBox hBox = new HBox(button1, button2, button3, button4);

        Scene scene = new Scene(hBox, 400, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
