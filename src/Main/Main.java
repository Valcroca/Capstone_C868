package Main;

import DAOImplementation.DBConnection;
import DAOImplementation.DBQueries;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View_Controller/LoginScreen.fxml"));
        primaryStage.setTitle("Valeria Roca - Capstone Project");
        primaryStage.setScene(new Scene(root, 685, 503));
        primaryStage.show();
    }


    public static void main(String[] args) throws SQLException {
        launch(args);
        DBConnection.closeConnection();
    }
}
