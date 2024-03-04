package org.example.oopproject.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.example.oopproject.SceneSwitch.SceneSwitch;

import java.io.IOException;

public class TrackerController {

    @FXML
    private Button buttonBackMenu;

    @FXML
    private Button buttonTrackingPacket;

    @FXML
    private TextField labelTrackingCode;

    @FXML
    private AnchorPane sceneTrackingPane;

    @FXML
    void onButtonBackClick() throws IOException {
        new SceneSwitch(sceneTrackingPane, "main.fxml");
    }

    @FXML
    void trackPackage(ActionEvent event) {

    }

}
