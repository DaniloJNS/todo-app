package com.todoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.stage.Stage;

public class TodoApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(TodoApplication.class.getResource("ui/view/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Control.USE_COMPUTED_SIZE, Control.USE_COMPUTED_SIZE);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}