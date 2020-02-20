package com.exalow.application.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Menu {

    public void display(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menu.fxml"));
        Scene scene = new Scene(root, 500, 400);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Welcome on Project Viewer !");
        stage.getIcons().add(new Image("create.png"));
        stage.show();
    }
}
