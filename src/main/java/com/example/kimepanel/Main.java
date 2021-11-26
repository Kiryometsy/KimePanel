package com.example.kimepanel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Kime Panel");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

/*
public class MyApp {
    final Stage stage;

    public MyApp(Stage stage) {
        this.stage = stage;
        primaryStage.setTitle("Kime Panel");
    }

    public void changeScene(Parent root) {
        stage.setScene(new Scene(root,600,400);
        stage.show();
    }
}

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MyApp application = new MyApp(stage);
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        application.changeScene(root);
    }
}
*/