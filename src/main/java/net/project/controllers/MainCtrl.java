package net.project.controllers;

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
import net.project.utils.CFile;


/**
 * @author learnercys (learner.cys@gmail.com)
 */
public class MainCtrl implements Initializable{

    @FXML private BorderPane root;
    @FXML private BorderPane cAreaContainer;
    @FXML private BorderPane sAreaContainer;

    private StructureArea sArea;
    private ConfigArea cArea;

    private int typeOfFile ( ) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Open file");
        alert.setContentText("File type?");

        ButtonType configButton = new ButtonType("Config");
        ButtonType structureButton = new ButtonType("Structure");
        ButtonType cancelButton = new ButtonType("Cancel");

        alert.getButtonTypes().setAll(configButton, structureButton, cancelButton);

        Optional<ButtonType> result = alert.showAndWait();


        return result.get() == configButton ?
                FileType.CONFIG : result.get() == structureButton ?
                FileType.STR : FileType.ERROR;
    }

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
        cArea.doCompilation();
    }

    /**
     * TODO load the structure file.
     */
    public void loadStructureFile ( ) {
        sArea.doCompilation();
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
        int fileType = typeOfFile();
        if( fileType != FileType.ERROR ) {
            FileChooser fileChooser = new FileChooser();

            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("xconf files", "*.xconf")
            );

            try {
                CFile cFile = new CFile( fileChooser.showOpenDialog(root.getScene().getWindow()));

                if(cFile.canRead()) {
                    if ( fileType == FileType.CONFIG) {
                        // configuration file
                        cArea.setFile(cFile);
                    } else if( fileType == FileType.STR ) {
                        // structure file
                        sArea.setFile(cFile);
                    }
                }
            } catch ( NullPointerException e ) {
                // something horrible happen, is not my fault.
            }
        }
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

    /**
     * init the manual window
     *
     * @param type Indicate what will be show in the window.
     *
     * @throws Exception to load the 'fxml' file.
     */
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

    private interface FileType {
        public static final int ERROR = 0;
        public static final int CONFIG = 1;
        public static final int STR = 2;
    }
}

