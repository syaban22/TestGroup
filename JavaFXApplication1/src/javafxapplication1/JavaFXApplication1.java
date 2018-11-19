/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.geometry.*;

/**
 *
 * @author Syaban22
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage stage) {
        Layout1(stage);
        Layout2(stage);
        HBox hbox = new HBox();
        Scene scene = new Scene(hbox, 700,300);
    }
    public void Layout1(Stage stage){
        BorderPane pane = new BorderPane();
        HBox  hbox = new HBox();
        hbox.getChildren().addAll();
    }
    
    public void Layout2(Stage stage){
        BorderPane pane2 = new BorderPane();
        HBox  hbox2 = new HBox();
        hbox2.getChildren().addAll();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
