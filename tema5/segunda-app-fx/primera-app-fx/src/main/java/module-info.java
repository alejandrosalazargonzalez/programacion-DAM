module es.ies.puerto {
    requires javafx.fxml;
    requires javafx.controls;
    requires transitive java.sql;
    requires org.controlsfx.controls;
    requires transitive javafx.graphics;

    exports es.ies.puerto;
    exports es.ies.puerto.model;
    exports es.ies.puerto.controller;
    exports es.ies.puerto.abstractas;
    exports es.ies.puerto.config;

    opens es.ies.puerto to javafx.fxml;
    opens es.ies.puerto.controller to javafx.fxml;
    opens es.ies.puerto.model to com.fasterxml.jackson.databind;
}