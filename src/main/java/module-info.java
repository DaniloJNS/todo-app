module com.todo.todoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.todoapp to javafx.fxml;
    exports com.todoapp;
    exports com.todoapp.controller;
    opens com.todoapp.controller to javafx.fxml;
}