package org.example.oopproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import okhttp3.*;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 330);
        stage.setTitle("FABRICIOUS TRACKER");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
        try {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            Request request = new Request.Builder()
                    .url("https://api.linketrack.com/track/json?user=teste&token=1abcd00b2731640e886fb41a8a9671ad1434c599dbaa0a0de9a5aa619f29a83f&codigo=LX785059405CN")
                    .method("GET", null)
                    .build();

            Response response = client.newCall(request).execute();
            do{
                response = client.newCall(request).execute();
            } while(response.code() != 200);

            System.out.println(response.body().string());

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}