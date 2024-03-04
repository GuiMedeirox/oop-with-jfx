package org.example.oopproject.SceneSwitch;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import org.example.oopproject.MainApplication;

import java.io.IOException;
import java.util.Objects;

public class SceneSwitch {
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException{
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(MainApplication.class.getResource(fxml)));
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);
    }
}
