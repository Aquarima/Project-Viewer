package com.exalow.application.controller;

import com.exalow.application.core.Viewer;
import com.exalow.application.model.Project;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CreatorController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField locationField;

    @FXML
    public void onTextFieldClicked() {
        nameField.setStyle("-fx-border-color: black; ");
        locationField.setStyle("-fx-border-color: black; ");
    }

    @FXML
    public void onValidate() {

        if (!isValidName()) {
            nameField.setStyle("-fx-border-color: red; ");
        }

        if (!isValidLocation()) {
            locationField.setStyle("-fx-border-color: red; ");
        }

        if (isValidName() && isValidLocation()) {
            final Project project = Project.createAs(nameField.getText(), locationField.getText());
            new Viewer(project);
        }

    }

    private boolean isValidName() {
        return !nameField.getText().isEmpty() && nameField.getText().matches("[a-zA-Z_0-9]+");
    }

    private boolean isValidLocation() {
        return !locationField.getText().isEmpty();
    }

}
