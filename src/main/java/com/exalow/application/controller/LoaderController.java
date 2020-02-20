package com.exalow.application.controller;

import com.exalow.application.core.Viewer;
import com.exalow.application.model.Project;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoaderController {

    @FXML
    private TextField locationField;

    @FXML
    public void onValidate() {

        if (!isValidLocation()) {
            locationField.setStyle("-fx-border-color: red; ");
            return;
        }

        final Project project = Project.loadFromDirectory(locationField.getText());
        new Viewer(project);
    }

    private boolean isValidLocation() {
        return !locationField.getText().isEmpty();
    }
}
