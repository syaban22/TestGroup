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
    }
    public void Layout1(Stage stage){
        Button btn = new Button();
        btn.setText("Tombol Keluar");
        btn.setOnAction(e -> Layout2(stage));
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);
        
        Scene scene = new Scene(pane, 300, 300);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
    }
    
    public void Layout2(Stage stage){
        Button btn = new Button();
        btn.setText("YES");
        Button btn2 = new Button();
        btn2.setText("NO");
        Text text = new Text("Are You Sure?");
        text.setFont(new Font(20));
        btn.setOnAction(e -> stage.close());
        btn2.setOnAction(e -> Layout1(stage));
        Region spacer = new Region();
        BorderPane pane2 = new BorderPane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox  hbox2 = new HBox();
        hbox2.getChildren().addAll(btn,spacer,btn2);
        pane2.setBottom(hbox2);
        pane2.setCenter(text);
        stage.centerOnScreen();
        
        Scene scene = new Scene(pane2);
        stage.setTitle("Main Menu");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
