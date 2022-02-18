package com.example.demo;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Test window");
        Label label = new Label("Not clicked");
        Button button = new Button("Click me");
        button.setOnAction(value ->  {
            if(!label.getText().equals("Clicked!"))
            label.setText("Clicked!");
            else label.setText("Clicked ones more!");
        });
        HBox hbox = new HBox(button, label);
        Scene scene = new Scene(hbox, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}