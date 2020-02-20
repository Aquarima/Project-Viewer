package com.exalow.application.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Loader {

    public void display() throws Exception {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/loader.fxml"));
        Scene scene = new Scene(root, 700, 95);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Open Project");
        stage.getIcons().add(new Image("open.png"));
        stage.show();
    }
}
