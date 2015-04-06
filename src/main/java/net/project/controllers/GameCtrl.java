package net.project.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * @author learnercys (learner.cys@gmail.com)
 *         Created on 5/04/15.
 */
public class GameCtrl implements Initializable{

    @FXML BorderPane root;

    final double GAME_HEIGHT = 600.0;
    final double GAME_WIDTH = 800.0;
    final Canvas canvasGame = new Canvas(GAME_WIDTH, GAME_HEIGHT);

    private GraphicsContext gameGC;
    private ArrayList<HashMap<String, String>> symbols = new ArrayList<>();

    /**
     *
     * @param background container the next data
     *                   name: of the background
     *                   height: of the background
     *                   width: of the background
     */
    public void initBackground(String background) {
        HashMap<String, String> symbol = getSymbol(background, "background");
        gameGC.drawImage(new Image(new File(symbol.get("picture").substring(1, symbol.get("picture").length() - 1)).toURI().toString()),0,0, (int)GAME_WIDTH,(int)GAME_HEIGHT);
        System.out.println("initBackground");
        System.out.println("canvasGame.getHeight(): " + canvasGame.getHeight() );
        System.out.println("canvasGame.getWidth(): " + canvasGame.getWidth() );
    }

    public void setSymbols( ArrayList<HashMap<String, String>> symbols) {
        this.symbols = symbols;
    }

    private HashMap<String, String> getSymbol(String name, String scope) {
        for (HashMap<String, String> symbol : this.symbols) {
            if(symbol.get("scope").equals(scope) && symbol.get("name").equals(name)) {
                return symbol;
            }
        }
        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        // canvas
        gameGC = canvasGame.getGraphicsContext2D();
        root.setCenter(canvasGame);
    }
}
