package net.project;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.project.controllers.MainCtrl;

/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 3/9/15.
 */
public class Main extends Application {

    public static final String APP_TITLE = "Game solution";
    public static URL appBase;
    public static URL appTemplates;
    public static String appFXML;
    public static String appHTML;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // defining base route.
        appBase = getClass().getResource("");
        appFXML = getClass().getResource("fxml").toString();
        appHTML = getClass().getResource("html").toString();
        appTemplates = getClass().getResource("html");

        FXMLLoader loader = new FXMLLoader( new URL( appFXML + "/mainctrl.fxml"));

        primaryStage.setTitle( APP_TITLE );
        primaryStage.setScene( new Scene( loader.load() ) );

        // close listener
        primaryStage.setOnCloseRequest((e)-> {
            MainCtrl mainCtrl = loader.getController();
            mainCtrl.closeApp();
        });

        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
