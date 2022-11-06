package com.todoapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import com.todoapp.ui.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController  implements Initializable {
    @FXML
    public HBox hBox;

    @FXML
    public Button newListButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Intialization program...");
    }

    public void onHandleClick() {
        NewTaskListDialogBox dialogBox = new NewTaskListDialogBox();
        dialogBox.display((Stage) hBox.getScene().getWindow());
    }
}