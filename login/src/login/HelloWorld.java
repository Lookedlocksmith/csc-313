/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.geom.Rectangle2D;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 *
 * @author Tanner
 */
public class HelloWorld extends Application {
    public static void main(String[] args) {
        launch(args);
      }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button SignIn = new Button();
        SignIn.setText("Say 'Hello World'");
        SignIn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
     

  
        StackPane root = new StackPane();
        root.getChildren().add(SignIn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }


    /**
     * @param args the command line arguments
     */
   
}
    

