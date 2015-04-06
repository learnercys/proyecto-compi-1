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

    private int rows;
    private int columns;
    private double nodeHeight;
    private double nodeWidth;

    private HashMap<String, String> hero;
    private HashMap<String, String> finish;
    private ArrayList<HashMap<String, String>> enemies;
    private ArrayList<HashMap<String, String>> weapons;
    private ArrayList<HashMap<String, String>> bombs;
    private ArrayList<HashMap<String, String>> bonusList;

    private HashMap<String, String> getSymbol(String name, String scope) {
        for (HashMap<String, String> symbol : this.symbols) {
            if(symbol.get("scope").equals(scope) && symbol.get("name").equals(name)) {
                return symbol;
            }
        }
        return null;
    }

    private HashMap<String, String> getSymbol(String name, String scope, String type) {
        for (HashMap<String, String> symbol : this.symbols) {
            /*System.out.print("(scope): " + symbol.get("scope") );
            System.out.println(", " + scope);
            System.out.print("(name): " + symbol.get("name"));
            System.out.println(", " + name);
            System.out.print("(type): " + symbol.get("type"));
            System.out.println(", " + type );*/
            if(symbol.get("scope").equals(scope) && symbol.get("name").equals(name) && symbol.get("type").equals(type)) {
                return symbol;
            }
        }
        return null;
    }

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
    }

    public void setSymbols( ArrayList<HashMap<String, String>> symbols) {
        this.symbols = symbols;
    }

    public void setSize(int columns, int rows) {
        this.rows = rows;
        this.columns = columns;
        this.nodeHeight = GAME_HEIGHT / rows;
        this.nodeWidth = GAME_WIDTH / columns;

        //System.out.println("rows: " + rows );
        /*System.out.println("columns: " + columns );
        System.out.println("this.nodeWidth: " + this.nodeWidth );
        System.out.println("GAME_WIDTH " + GAME_WIDTH);*/
    }

    /**
     *
     * @param hero container:
     *             name: hero name
     *             init: column position
     *             end:  row position
     */
    public void setHero(HashMap<String, String> hero) {
        this.hero = hero;
        // this.nodeWidth * row
        // draw hero
        HashMap<String, String> symbol = getSymbol(hero.get("name"), "figure", "hero");
        gameGC.drawImage(new Image(
                new File(symbol.get("picture").substring(1, symbol.get("picture").length() - 1)).toURI().toString()
        ), this.nodeWidth * Integer.parseInt(hero.get("init")), this.nodeHeight * Integer.parseInt(hero.get("end")), this.nodeWidth, this.nodeHeight);
    }

    public void setEnemies( ArrayList<HashMap<String, String>> enemies ) {
        this.enemies = enemies;
        for (HashMap<String, String> enemy : enemies) {
            HashMap<String, String> symbol = getSymbol(enemy.get("name"), "figure", "enemy");
            gameGC.drawImage(new Image(
                    new File(
                            symbol.get("picture").substring(1, symbol.get("picture").length() -1)
                    ).toURI().toString()
            ), this.nodeWidth * Integer.parseInt(enemy.get("init")), this.nodeHeight * Integer.parseInt(enemy.get("end")), this.nodeWidth, this.nodeHeight);
        }
    }

    public void setWeapons(ArrayList<HashMap<String, String>> weapons /*or bombs*/) {
        this.weapons = weapons;
        System.out.println("size: " + weapons.size());
        for (HashMap<String, String> weapon : weapons) {
            HashMap<String, String> symbol = getSymbol(weapon.get("name"), "design");
            System.out.println("symo.get(picture): " + symbol.get("picture"));
            System.out.println(this.nodeWidth * Integer.parseInt(weapon.get("init")));
            System.out.println(this.nodeHeight * Integer.parseInt(weapon.get("end")));
            gameGC.drawImage(new Image(
                    new File(
                            symbol.get("picture").substring(1, symbol.get("picture").length() - 1)
                    ).toURI().toString()
            ), this.nodeWidth * Integer.parseInt(weapon.get("init")), this.nodeHeight * Integer.parseInt(weapon.get("end")), this.nodeWidth, this.nodeHeight);
        }

    }

    public void setBonusList( ArrayList<HashMap<String, String>> bonusList) {
        this.bonusList = bonusList;
        for (HashMap<String, String> bonus : bonusList) {
            HashMap<String, String> symbol = getSymbol(bonus.get("name"), "design", "bonus");
            gameGC.drawImage(new Image(
                    new File(
                            symbol.get("picture").substring(1, symbol.get("picture").length() -1)
                    ).toURI().toString()
            ), this.nodeWidth * Integer.parseInt(bonus.get("init")), this.nodeHeight * Integer.parseInt(bonus.get("end")), this.nodeWidth, this.nodeHeight);
        }
    }

    public void setFinish( HashMap<String, String> finish ) {
        this.finish = finish;
        HashMap<String, String> symbol = getSymbol(finish.get("name"), "design", "finish");
        gameGC.drawImage(new Image(
                new File(symbol.get("picture").substring(1, symbol.get("picture").length() - 1)).toURI().toString()
        ), this.nodeWidth * Integer.parseInt(finish.get("init")), this.nodeHeight * Integer.parseInt(finish.get("end")), this.nodeWidth, this.nodeHeight);
    }

    @Override
    public void initialize(URL location, ResourceBundle resource) {
        // canvas
        gameGC = canvasGame.getGraphicsContext2D();
        root.setCenter(canvasGame);
    }
}
