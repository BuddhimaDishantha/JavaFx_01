package com.example.myjavafx;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class HelloController {
    public Label lblBanner;

    public void btnClickOnAction(ActionEvent actionEvent) {
        lblBanner.setText("Welcome This is my first Java_FX Application");
    }
}
