package com.todoapp.ui;


import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class NewTaskListDialogBox {
    private final Label label;
    private final TextField input;
    private final VBox mainPane;
    private final HBox buttonPane;
    private final Button confirmButton;
    private final Button cancelButton;
    private final Stage window;
    private final Scene scene;

    public NewTaskListDialogBox() {
        this.label = new Label("Nome da lista");
        this.confirmButton = new Button("Criar");
        this.cancelButton= new Button("Cancelar");
        this.input = new TextField();
        this.mainPane = new VBox();
        this.buttonPane = new HBox();
        this.window = new Stage();
        this.scene = new Scene(mainPane, 400, 150);
        setup();
    }
    private void setup() {
        window.initModality(Modality.NONE);
        window.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("css/NewTaskListDialogBox.css").toExternalForm());

        mainPane.getChildren().addAll(label, input, buttonPane);
        mainPane.getStyleClass().add("dialog-pane");

        buttonPane.getChildren().addAll(confirmButton, cancelButton);
        buttonPane.getStyleClass().add("button-pane");


        cancelButton.getStyleClass().add("cancel-button");
        confirmButton.getStyleClass().add("confirm-button");
        label.getStyleClass().add("label");
        input.getStyleClass().add("input");

        input.setPromptText("Insira o nome da lista");
    }

    public void display() {
        window.show();
    }

    public void display(Stage primaryStage) {
        window.initOwner(primaryStage);
        window.show();
    }
}