
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 1000, 200);
        stage.setScene(scene);

        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

        //set Stage boundaries to visible bounds of the main screen
        stage.setX(primaryScreenBounds.getMinX());
        stage.setY(primaryScreenBounds.getMinY());
        stage.setWidth(primaryScreenBounds.getWidth());
        stage.setHeight(primaryScreenBounds.getHeight());

        Button SignIn = new Button();
        SignIn.setLayoutX(1000);
        SignIn.setLayoutY(950);
        SignIn.setText("Sign In");
        root.getChildren().add(SignIn);
         SignIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            User.Login();
                If(setLogin = true){
                //let them into the system
               System.out.println("yayay");
               return;
            } else {
                    System.out.println("almost a yayaya");
                    return;
                    }
            }

        });

        Button NewUser = new Button();
        NewUser.setLayoutX(0);
        NewUser.setLayoutY(0);
        NewUser.setText("User Management");
        root.getChildren().add(NewUser);

        Button Exit = new Button();
        Exit.setLayoutX(850);
        Exit.setLayoutY(950);
        Exit.setText("Exit");
        root.getChildren().add(Exit);
        Exit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }

        });

        Label Username = new Label("Username: ");

        Username.setLayoutX(750);
        Username.setLayoutY(400);
        root.getChildren().add(Username);
        
        TextField NameInput = new TextField ();
        NameInput.setLayoutX(850);
       NameInput.setLayoutY(400);
        root.getChildren().add(NameInput);

        Label Password = new Label("Password: ");

        Password.setLayoutX(750);
        Password.setLayoutY(600);
        root.getChildren().add(Password);
        
         TextField PassInput = new TextField ();
        PassInput.setLayoutX(850);
       PassInput.setLayoutY(600);
        root.getChildren().add(PassInput);

        stage.show();

    }
      public void handle(ActionEvent event){
    
}

    public static void main(String[] args) {
        launch(args);
    }
}
