package net.project.controllers;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.*;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import net.project.Main;
import net.project.components.ConfigArea;
import net.project.components.StructureArea;
import net.project.lexer.configuration.ConfigurationLexer;
import net.project.lexer.structure.StructureLexer;
import net.project.utils.CFile;


/**
 * @author learnercys (learner.cys@gmail.com)
 */
public class MainCtrl implements Initializable{

    @FXML private BorderPane root;
    @FXML private BorderPane cAreaContainer;
    @FXML private BorderPane sAreaContainer;
    @FXML private MenuItem executeGameItem;
    @FXML private MenuItem showErrorsListItem;
    @FXML private MenuItem showSymbolsTableItem;
    @FXML private VBox noObjectsContainer;
    @FXML private VBox objectsContainer;
    @FXML private VBox noPreviewContainer;

    private BooleanProperty isSidebarOK = new SimpleBooleanProperty(false);
    private BooleanProperty isPreviewOK = new SimpleBooleanProperty(false);
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
     * load the configuration file
     *
     */
    public void loadConfigFile () {
        cArea.resetErrors();
        cArea.resetSymbols();
        cArea.doCompilation();
        if( cArea.getText().trim().length() == 0 || !sArea.isSaved()) {
            return;
        }
        if( cArea.hasErrors() ) {
            // has some errors
            if(cArea.showConfirmation("Found Errors", "The configuration file has errors. do you want to see them")) {
                showErrorsList();
            }
        } else {
            // TODO load elements in sidebar
        }
        showErrorsListItem.setDisable(!cArea.hasErrors());
        showSymbolsTableItem.setDisable(cArea.hasErrors());
        executeGameItem.setDisable(cArea.hasErrors() || sArea.hasErrors());
        isSidebarOK.setValue(!cArea.hasErrors());
    }

    /**
     * load the structure file.
     */
    public void loadStructureFile ( ) {
        sArea.resetErrors();
        sArea.resetSymbols();
        sArea.doCompilation();
        if( sArea.getText().trim().length() == 0 || !sArea.isSaved()) {
            return;
        }
        if( sArea.hasErrors() ) {
            // has some errors
            if(sArea.showConfirmation("Found Errors", "The structure file has errors. do you want to see them")) {
                showErrorsList();
            }

        } else {
            // TODO load elements in preview area.
        }
        showErrorsListItem.setDisable(!sArea.hasErrors());
        showSymbolsTableItem.setDisable(sArea.hasErrors());
        executeGameItem.setDisable(cArea.hasErrors() || sArea.hasErrors());
        isPreviewOK.setValue(!sArea.hasErrors());
    }

    /**
     *
     */
    public void newFile( ) {
        switch ( typeOfFile() ) {
            case FileType.CONFIG:
                cArea.resetArea();
                isSidebarOK.setValue(false);

            case FileType.STR:
                sArea.resetArea();
                isPreviewOK.setValue(false);
                break;

            default:
                // error type, nothing to do.
                break;
        }

        showErrorsListItem.setDisable(
                !cArea.hasErrors()
                        && !sArea.hasErrors()
        );

    }

    public void openAboutUs( ) throws Exception{
        Stage aboutUs = new Stage();
        BorderPane aboutUsRoot = FXMLLoader.load(new URL( Main.appFXML + "/aboutusctrl.fxml"));
        aboutUs.setTitle("About us");
        aboutUs.setScene(new Scene(aboutUsRoot));
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
     *
     */
    public void saveFileAs( ) {
        // and stupid trick
        saveFileAs(FileType.NO_TYPE);
    }

    public void saveFileAs( int type ) {
        if( type == FileType.NO_TYPE) {
            // only happen when is coming from saveFileAs() method.
            saveFileAs(typeOfFile());
        } else if( type != FileType.ERROR ) {
            // if the type is different to ERROR
            FileChooser fileS = new FileChooser();
            fileS.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("xconf files", "*.xconf")
            );

            File file = fileS.showSaveDialog(root.getScene().getWindow());

            // if the file is null the user put the cancel button or close the window.
            if( file != null ) {
                if( CFile.getExtension(file) == null || !CFile.getExtension(file).equals("xconf")  ) {
                    // in case the file does not have extension or the extension is not correct
                    // wee add the correct extension to the current file.
                    file = new File(file.getAbsolutePath() + ".xconf");  // just in case
                }
                CFile cFile = new CFile(file);
                switch (type) {
                    case FileType.CONFIG:
                        cFile.saveFile(cArea.getText());
                        cArea.setFile(cFile);
                        break;

                    case FileType.STR:
                        cFile.saveFile(sArea.getText());
                        sArea.setFile(cFile);
                        break;
                }
            }
        }
    }

    /**
     *
     */
    public void saveFile( ) {
        int type = typeOfFile();
        switch (type) {
            case FileType.CONFIG:
                // saving the configuration file

                // see if te current file already exist
                if(cArea.getFile() == null) {
                    saveFileAs(type);
                } else {
                    cArea.getFile().saveFile(cArea.getText());
                }
                break;
            case FileType.STR:
                // saving the 'structure' file

                // see if the current file already exist
                if(sArea.getFile() == null ) {
                    saveFileAs(type);
                } else {
                    sArea.getFile().saveFile(sArea.getText());
                }
                break;
            default:
                // none
        }
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
        try {
            MustacheFactory mustacheFactory = new DefaultMustacheFactory();
            Mustache mustache = mustacheFactory.compile(Main.appTemplates.getPath() + "/errors.mustache");
            File tmpFile = new File("/tmp/project-errors.html");
            Errors e = new Errors();
            e.addAll(cArea.getLexer(), sArea.getLexer());
            mustache.execute(new PrintWriter( tmpFile ), e).flush();

            showTable(CFile.read(tmpFile), "Symbols table");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * TODO show the symbols table
     */
    public void showSymbolsTable ( ) {
        try {
            MustacheFactory  mustacheFactory = new DefaultMustacheFactory();
            Mustache mustache = mustacheFactory.compile(Main.appHTML + "/errors.mustache");
            File tmpFile = new File("/tmp/project-errors.html");
            mustache.execute(new PrintWriter( tmpFile ), cArea.getLexer()).flush();

            showTable(CFile.read(tmpFile), "Symbols table");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showTable( String html, String title)  throws Exception{
        Stage table = new Stage(StageStyle.DECORATED);
        FXMLLoader loader = new FXMLLoader(new URL(Main.appFXML + "/tablectrl.fxml"));

        table.setScene(new Scene(loader.load()));
        TableCtrl tableCtrl = loader.getController();
        tableCtrl.initData( html, title );
        table.setMaximized(true);
        table.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // injecting configuration area.
        cArea = new ConfigArea();
        cAreaContainer.setCenter(cArea);

        // injecting structure area.
        sArea = new StructureArea();
        sAreaContainer.setCenter(sArea);

        // sidebar
        noObjectsContainer.managedProperty().bind(noObjectsContainer.visibleProperty());
        noObjectsContainer.visibleProperty().bind(isSidebarOK.not());

        objectsContainer.managedProperty().bind(objectsContainer.visibleProperty());
        objectsContainer.visibleProperty().bind(isSidebarOK);

        // preview
        noPreviewContainer.managedProperty().bind(noPreviewContainer.visibleProperty());
        noPreviewContainer.visibleProperty().bind(isPreviewOK.not());

    }

    public class Errors {
        public ArrayList<HashMap<String,String>> errors = new ArrayList<>();

        public void addAll(ConfigurationLexer c, StructureLexer s) {
            System.out.println("addAll");
            if( c != null && c.hasErrors()) {
                for (HashMap<String, String> error : c.errors) {
                    HashMap<String,String> tmp = new HashMap<>();
                    tmp.put("line", error.get("line"));
                    tmp.put("column", error.get("column"));
                    tmp.put("text", error.get("text"));
                    tmp.put("file", "configuration");
                    tmp.put("number", Integer.toString(errors.size() + 1));
                    errors.add(tmp);
                }
            }

            if( s != null && s.hasErrors() ) {
                for (HashMap<String, String> error : s.errors) {
                    HashMap<String,String> tmp = new HashMap<>();
                    tmp.put("line", error.get("line"));
                    tmp.put("column", error.get("column"));
                    tmp.put("text", error.get("text"));
                    tmp.put("file", "structure");
                    tmp.put("number", Integer.toString(errors.size() + 1));
                    errors.add(tmp);
                }
            }
        }
    }

    private interface FileType {
        public static final int NO_TYPE = -1;
        public static final int ERROR = 0;
        public static final int CONFIG = 1;
        public static final int STR = 2;
    }
}

