module es.ies.puerto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;
    requires com.fasterxml.jackson.databind;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.controller;
    exports es.ies.puerto.model;
    exports es.ies.puerto.config;
    exports es.ies.puerto.controller.abstractas;
    
    opens es.ies.puerto.controller to javafx.fxml;
}