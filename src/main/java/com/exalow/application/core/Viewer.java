package com.exalow.application.core;

import com.exalow.application.model.Project;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Viewer {

    private Project project;

    public Viewer(Project project) {
        this.project = project;
    }

    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/menu.fxml"));
        stage.setTitle("Project Viewer - BETA");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }
}
