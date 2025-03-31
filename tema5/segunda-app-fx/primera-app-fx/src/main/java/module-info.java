module es.ies.puerto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;
    requires com.fasterxml.jackson.databind;
    requires java.xml;
    requires java.sql;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.controller;
    exports es.ies.puerto.abstractas;
    exports es.ies.puerto.model.abstractas;
    exports es.ies.puerto.model;

    opens es.ies.puerto.controller to javafx.fxml;
}