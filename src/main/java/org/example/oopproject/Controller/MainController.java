package org.example.oopproject.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.example.oopproject.SceneSwitch.SceneSwitch;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane mainSceneAnchorPane;

    @FXML
    private Button saveButton;

    @FXML
    private Button trackButton;

    @FXML
    void onSaveButtonClick() {

    }

    @FXML
    void onTrackButtonClick() throws IOException {
        new SceneSwitch(mainSceneAnchorPane, "track.fxml");
    }

}







//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    private Label modifiedText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Hello World");
//    }
//
//    @FXML
//    protected void onHelloCustomButtonClick() {
//        welcomeText.setText("This is a custom message");
//        modifiedText.setText("Modified Text");
//    }