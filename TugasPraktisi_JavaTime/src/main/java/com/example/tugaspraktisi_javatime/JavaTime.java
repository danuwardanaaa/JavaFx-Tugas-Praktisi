package com.example.tugaspraktisi_javatime;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.ZoneId;

public class JavaTime extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(JavaTime.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 477, 159);
        stage.setTitle("Java Time - Tugas Praktisi 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}