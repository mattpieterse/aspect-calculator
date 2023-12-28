package com.mp.aspectcalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AspectApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader sceneFile = new FXMLLoader(AspectApp.class.getResource("aspect-view.fxml"));
        Scene scene = new Scene(sceneFile.load());

        stage.setTitle("Aspect Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}