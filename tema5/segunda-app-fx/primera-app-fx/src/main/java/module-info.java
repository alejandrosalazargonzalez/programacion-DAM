module es.ies.puerto {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires transitive javafx.graphics;
	requires transitive java.sql;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.controller;
    exports es.ies.puerto.abstractas;
    exports es.ies.puerto.config;
    exports es.ies.puerto.model;
    exports es.ies.puerto.model.abtrastas;

    opens es.ies.puerto.controller to javafx.fxml;
}