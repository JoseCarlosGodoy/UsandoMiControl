/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomicontrol;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import micontrol.Micontrol;

/**
 *
 * @author Usuario
 */
public class UsandoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label respuesta=new Label();
        BorderPane root=new BorderPane();
        Micontrol mcontrol=new Micontrol();
        
       
        mcontrol.setMaxHeight(100);
        mcontrol.setMaxWidth(100);
        
        root.setBottom(respuesta);
        root.setCenter(mcontrol);
        
        mcontrol.setOnAction(e->{
            respuesta.setText("Estoy pulsando mi control");
        });
        
        Scene scene=new Scene(root,400,400);
        
        primaryStage.setTitle("Usando mi control");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
