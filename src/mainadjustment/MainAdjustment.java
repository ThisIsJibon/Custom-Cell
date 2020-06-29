/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainadjustment;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Asus
 */
public class MainAdjustment extends Application {
    
    @Override
    public void start(Stage primaryStage){
           
       Pane root= new Pane();
        try {
            root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(MainAdjustment.class.getName()).log(Level.SEVERE, null, ex);
        }
       Scene scene = new Scene(root);
       Stage window=new Stage();
       window.setScene(scene);
       window.setTitle("Please Login");
       window.show(); 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
