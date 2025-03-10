module es.ies.puerto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.controller;
    opens es.ies.puerto.controller to javafx.fxml;
}