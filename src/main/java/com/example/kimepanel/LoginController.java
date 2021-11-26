package com.example.kimepanel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginController {

    @FXML
    private Button exitButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordTextField;

    public void loginButtonOnAction(ActionEvent e) {

        if (usernameTextField.getText().isBlank() == false && passwordTextField.getText().isBlank() == false) {
            loginMessageLabel.setText("...");
            validateLogin();
        } else {
            loginMessageLabel.setText("Please enter username and password");
        }

    }

    public void exitButtonOnAction(ActionEvent e) {
        Stage stage = (Stage) exitButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin() {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM User_Account WHERE username = '" + usernameTextField.getText() + "' AND password = '" + passwordTextField.getText() + "'";
        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while(queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    loginMessageLabel.setText("Welcome");

                } else {
                    loginMessageLabel.setText("Invalid Login.");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}