package net.project.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import net.project.Main;


/**
 * @author learnercys (learner.cys@gmail.com)
 */
public class MainCtrl implements Initializable{

    @FXML private BorderPane root;

    public void closeApp( ) {
        Stage stage = (Stage)root.getScene().getWindow();
        stage.close();
    }

    public void openAboutUs( ) throws Exception{
        Stage aboutUs = new Stage();
        BorderPane aboutUsRoot = FXMLLoader.load(new URL( Main.appFXML + "/aboutusctrl.fxml"));
        aboutUs.setTitle("About us");
        aboutUs.setScene( new Scene( aboutUsRoot ) );
        aboutUs.show();
    }

    public void openTechnicalManual( ) {

    }

    public void openUserManual( ) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

