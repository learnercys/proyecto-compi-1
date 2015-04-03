package net.project.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;
import net.project.Main;
import net.project.components.ConfigArea;
import net.project.components.StructureArea;


/**
 * @author learnercys (learner.cys@gmail.com)
 */
public class MainCtrl implements Initializable{

    @FXML private BorderPane root;
    @FXML private BorderPane cAreaContainer;
    @FXML private BorderPane sAreaContainer;

    private StructureArea sArea;
    private ConfigArea cArea;

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
        try {
            startManual( ManualCtrl.ManualTypes.TECHNICAL);
        } catch (Exception e ) {
            //
        }
    }

    public void openUserManual( ) {
        try {
            startManual(ManualCtrl.ManualTypes.USER);
        } catch (Exception e ) {
            //
        }
    }

    public void startManual ( int type ) throws Exception{
        Stage manual = new Stage(StageStyle.DECORATED);
        FXMLLoader loader = new FXMLLoader( new URL( Main.appFXML + "/manualctrl.fxml") );

        manual.setScene(new Scene(loader.load()));

        ManualCtrl manualCtrl = loader.getController();
        manualCtrl.initData( type );
        manual.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // injecting configuration area.
        cArea = new ConfigArea();
        cAreaContainer.setCenter(cArea);

        // injecting structure area.
        sArea = new StructureArea();
        sAreaContainer.setCenter(sArea);

    }
}

