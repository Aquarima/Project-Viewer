package com.exalow.application.controller;

import com.exalow.application.core.Creator;
import com.exalow.application.core.Loader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

    @FXML
    private Button create;

    @FXML
    private Button open;

    @FXML
    private Button exit;

    @FXML
    public void onCreateRequest() throws Exception {
        new Creator().display();
    }

    @FXML
    public void onLoadRequest() throws Exception {
        new Loader().display();
    }

    @FXML
    public void onExitRequest() {
        System.exit(0);
    }
}
