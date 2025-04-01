module es.ies.puerto {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive org.controlsfx.controls;
    requires javafx.graphics;
    requires java.sql;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.servicio;
    exports es.ies.puerto.controller;
    exports es.ies.puerto.model;
    exports es.ies.puerto.abstractas;
    exports es.ies.puerto.abstractas;
    exports es.ies.puerto.model;
    exports es.ies.puerto.config;
    opens es.ies.puerto.controller to javafx.fxml;
}