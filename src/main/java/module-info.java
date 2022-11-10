module com.todo.todoapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires jakarta.persistence;
    requires org.slf4j;
    requires java.naming;
    requires btm;
    requires org.hibernate.orm.core;

    opens com.todoapp to javafx.fxml;
    exports com.todoapp;
    exports com.todoapp.controller;
    exports com.todoapp.model to org.hibernate.orm.core;
    opens com.todoapp.controller to javafx.fxml;
}