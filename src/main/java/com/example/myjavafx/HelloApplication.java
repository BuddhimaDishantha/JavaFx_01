package com.example.myjavafx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent p1= FXMLLoader.load(this.getClass().getResource("hello.fxml"));
        Scene scene=new Scene(p1);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My first JAVA_FX Application");
        primaryStage.centerOnScreen();
        primaryStage.show();
        
    }
}
