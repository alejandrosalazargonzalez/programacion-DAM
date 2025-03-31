module es.ies.puerto {
    requires javafx.controls;
    requires javafx.fxml;

    requires transitive org.controlsfx.controls;
    requires transitive javafx.graphics;
    requires transitive java.sql;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.controller;
    exports es.ies.puerto.model;
    opens es.ies.puerto.controller to javafx.fxml;
}