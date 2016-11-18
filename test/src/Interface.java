
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tanner
 */
public class Interface extends Main {

   public void  HomePage(Stage stage) {
        Group root = new Group();
        Scene scene1 = new Scene(root, 1000, 200);
        stage.setScene(scene1);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        Button FIncomp = new Button();
        FIncomp.setLayoutX(1000);
        FIncomp.setLayoutY(950);
        FIncomp.setText("Finish Incompleted Quotes");
        root.getChildren().add(FIncomp);

        Button Select = new Button();
        Select.setLayoutX(900);
        Select.setLayoutY(950);
        Select.setText("Select");
        root.getChildren().add(Select);
        Select.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

            }

        });

        Button NewQuote = new Button();
        NewQuote.setLayoutX(800);
        NewQuote.setLayoutY(950);
        NewQuote.setText("New Quote");
        root.getChildren().add(NewQuote);

        Button Exit = new Button();
        Exit.setLayoutX(700);
        Exit.setLayoutY(950);
        Exit.setText("Exit");
        root.getChildren().add(Exit);
        Exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }

        });
        TextField Filter = new TextField();
        Filter.setLayoutX(1200);
        Filter.setLayoutY(50);
        Filter.getText();
        // UserName = UserInput.getText();
        root.getChildren().add(Filter);

        Label DB = new Label("Database");
        DB.setLayoutX(600);
        DB.setLayoutY(50);
        root.getChildren().add(DB);

        Label HomePage = new Label("Home Page");

        HomePage.setLayoutX(900);
        HomePage.setLayoutY(0);
        root.getChildren().add(HomePage);

        Label CurrentlyLogged = new Label("Logged in : ");
        //  CurrentUser.setText(UserName);
        CurrentlyLogged.setLayoutX(50);
        CurrentlyLogged.setLayoutY(0);
        root.getChildren().add(CurrentlyLogged);

        Label CurrentUser = new Label("HI");
        //  CurrentUser.setText(UserName);
        CurrentUser.setLayoutX(125);
        CurrentUser.setLayoutY(0);
        root.getChildren().add(CurrentUser);

        stage.show();

    }
}