package com.exalow.application.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Creator {

    public void display() throws Exception {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/creator.fxml"));
        Scene scene = new Scene(root, 700, 135);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("New Project");
        stage.getIcons().add(new Image("create.png"));
        stage.show();
    }
}
