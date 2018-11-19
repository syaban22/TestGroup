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
import javafx.scene.text.*;



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
        Button btn = new Button();
        btn.setText("Close");
        
        BorderPane pane = new BorderPane();
        HBox  hbox = new HBox();
        hbox.getChildren().addAll();
        
        Scene scene = new Scene(pane, 600, 300);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    public void Layout2(Stage stage){
        Button btn = new Button();
        btn.setText("YES");
        Button btn2 = new Button();
        btn2.setText("NO");
        Text text = new Text();
        text.setFont(new Font(45));

        BorderPane pane2 = new BorderPane();
        HBox  hbox2 = new HBox();
        hbox2.getChildren().addAll();
        
        Scene scene = new Scene(pane2, 600, 300);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
