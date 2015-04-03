package net.project.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;
import net.project.Main;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author learnercys (learner.cys@gmail.com)
 * Created on 2/04/15.
 */
public class ManualCtrl  implements Initializable{

    @FXML Label title;

    @FXML WebView webView;

    /**
     *
     * @param type The manual type.
     */
    public void initData( int type ) {
        String path;

        switch ( type ) {
            case ManualTypes.TECHNICAL:
                title.setText("Manual Técnico");
                path = Main.appHTML + "/manual-tecnico.html";
                break;

            case ManualTypes.USER:
                title.setText("Manual de Usuario");
                path = Main.appHTML + "/manual-de-usuario.html";
                break;
            default:
                // some error happen.
                path = "";
                break;
        }

        webView.getEngine().load(path);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public interface ManualTypes {
        public static final int TECHNICAL = 0;
        public static final int USER = 1;
    }
}
