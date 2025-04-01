module es.ies.puerto {
    requires javafx.controls;
    requires javafx.fxml;

<<<<<<< HEAD
    requires transitive org.controlsfx.controls;
    requires transitive javafx.graphics;
=======
    requires org.controlsfx.controls;
    requires javafx.graphics;
>>>>>>> parent of df7c205 (avances 27/03)
    requires java.sql;

    opens es.ies.puerto to javafx.fxml;
    exports es.ies.puerto;
    exports es.ies.puerto.servicio;
    exports es.ies.puerto.controller;
<<<<<<< HEAD
    exports es.ies.puerto.model;
=======
    exports es.ies.puerto.abstractas;
>>>>>>> parent of df7c205 (avances 27/03)
    opens es.ies.puerto.controller to javafx.fxml;
}