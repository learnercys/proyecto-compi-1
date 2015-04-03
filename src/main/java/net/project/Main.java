package net.project;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 3/9/15.
 */
public class Main extends Application {

    public static final String APP_TITLE = "Game solution";
    public static URL appBase;
    public static String appFXML;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // defining base route.
        appBase = getClass().getResource("");
        appFXML = getClass().getResource("fxml").toString();

        Pane root = FXMLLoader.load( new URL( appFXML + "/mainctrl.fxml") );
        primaryStage.setTitle( APP_TITLE );
        primaryStage.setScene( new Scene( root ) );
        primaryStage.show();
    }

    public static void main( String[] args ) {
        launch( args );
    }
}
