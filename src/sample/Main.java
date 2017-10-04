package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        Label label = new Label("Hello World, JavaFZ!");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
