module org.example.oopproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires okhttp3;

    opens org.example.oopproject to javafx.fxml;
    exports org.example.oopproject;
    exports org.example.oopproject.Controller;
    opens org.example.oopproject.Controller to javafx.fxml;
}