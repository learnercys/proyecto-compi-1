package net.project.controllers;

import java.awt.*;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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

    /**
     * TODO execute the current game
     */
    public void executeGame ( ) {

    }

    /**
     * TODO load the configuration file
     */
    public void loadConfigFile () {

    }

    /**
     * TODO load the structure file.
     */
    public void loadStructureFile ( ) {

    }

    /**
     * TODO create a new File
     */
    public void newFile( ) {

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

    public void openFile ( ) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Open file");
        alert.setContentText("File type?");

        ButtonType configButton = new ButtonType("Configuration");
        ButtonType structureButton = new ButtonType("Structure");
        ButtonType cancelButton = new ButtonType("Cancel");

        alert.getButtonTypes().setAll(configButton, structureButton, cancelButton);

        Optional<ButtonType> result = alert.showAndWait();
        String type;
        if(result.get() == configButton) {
            // configuration file
            System.out.println("hola");
        } else if ( result.get() == structureButton ) {
            // structure file
            System.out.println("dos");
        } else {
            return;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("xconf files", "*.xconf")
        );
    }

    /**
     * TODO save the current file as a new file( or replace for another).
     */
    public void saveFileAs( ) {

    }

    /**
     * TODO save the current file.
     */
    public void saveFile( ) {

    }

    public void startManual ( int type ) throws Exception{
        Stage manual = new Stage(StageStyle.DECORATED);
        FXMLLoader loader = new FXMLLoader( new URL( Main.appFXML + "/manualctrl.fxml") );

        manual.setScene(new Scene(loader.load()));

        ManualCtrl manualCtrl = loader.getController();
        manualCtrl.initData( type );
        manual.show();
    }

    /**
     * TODO show the current error list
     */
    public void showErrorsList ( ) {

    }

    /**
     * TODO show the symbols table
     */
    public void showSymbolsTable ( ) {

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

