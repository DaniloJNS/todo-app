package com.todoapp.ui;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DialogBox {
    private final Stage window;

    public DialogBox() {
        this.window = new Stage();
        window.initModality(Modality.WINDOW_MODAL);
    }

    public void setPane(Pane pane) {
        Scene scene = new Scene(pane);
        scene.getStylesheets().add(getClass().getResource("css/Main.css").toExternalForm());
        window.setScene(scene);
    }

     void display() {
        window.show();
    }
}