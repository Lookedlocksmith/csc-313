
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
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

        //  set Stage boundaries to visible bounds of the main screen
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
                //     LoginMain = User.Login;
                User.Login(UserName, Pass);

                if (User.Login == true) {
                    //        let them into the system
                    System.out.println("yayay");

                } else {

                    Group root = new Group();
                    Scene scene1 = new Scene(root, 1000, 200);
                    stage.setScene(scene1);

                    Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();

                    //set Stage boundaries to visible bounds of the main screen
                    stage.setX(primaryScreenBounds.getMinX());
                    stage.setY(primaryScreenBounds.getMinY());
                    stage.setWidth(primaryScreenBounds.getWidth());
                    stage.setHeight(primaryScreenBounds.getHeight());

                

                    Button NewQuote = new Button();
                    NewQuote.setLayoutX(800);
                    NewQuote.setLayoutY(950);
                    NewQuote.setText("New Quote");
                    root.getChildren().add(NewQuote);
                    NewQuote.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                           

                           

                            Button Logout = new Button();
                            Logout.setLayoutX(600);
                            Logout.setLayoutY(950);
                            Logout.setText("Logout");
                            root.getChildren().add(Logout);
                            Logout.setOnAction(new EventHandler<ActionEvent>() {

                                @Override
                                public void handle(ActionEvent event) {
                                    stage.setScene(scene1);

                                }

                            });

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
                            NewQuote.setOnAction(new EventHandler<ActionEvent>() {

                                @Override
                                public void handle(ActionEvent event) {
                                    Group root = new Group();
                                    Scene scene2 = new Scene(root, 1000, 200);
                                    stage.setScene(scene2);

                                    final ScrollBar sc = new ScrollBar();

                                    root.getChildren().addAll(sc);

                                    sc.setLayoutX(100);
                                    sc.setLayoutY(75);
                                    sc.setMin(0);
                                    sc.setOrientation(Orientation.VERTICAL);
                                    sc.setPrefHeight(180);
                                    sc.setMax(500);
                                    final ScrollBar sc2 = new ScrollBar();

                                    root.getChildren().addAll(sc2);

                                    sc2.setLayoutX(100);
                                    sc2.setLayoutY(300);
                                    sc2.setMin(0);
                                    sc2.setOrientation(Orientation.VERTICAL);
                                    sc2.setPrefHeight(180);
                                    sc2.setMax(500);
                                    final ScrollBar sc3 = new ScrollBar();

                                    root.getChildren().addAll(sc3);

                                    sc3.setLayoutX(100);
                                    sc3.setLayoutY(525);
                                    sc3.setMin(0);
                                    sc3.setOrientation(Orientation.VERTICAL);
                                    sc3.setPrefHeight(180);
                                    sc3.setMax(500);
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
                                    Label QPage1 = new Label("Quote Page 1/2");
                                    //  CurrentUser.setText(UserName);
                                    QPage1.setLayoutX(900);
                                    QPage1.setLayoutY(0);
                                    root.getChildren().add(QPage1);

                                    Button Next = new Button();
                                    Next.setLayoutX(1100);
                                    Next.setLayoutY(950);
                                    Next.setText("Next Page");
                                    root.getChildren().add(Next);
                                    Next.setOnAction(new EventHandler<ActionEvent>() {

                                        @Override
                                        public void handle(ActionEvent event) {
                                            Group root = new Group();
                                            Scene scene3 = new Scene(root, 1000, 200);
                                            stage.setScene(scene3);
                                            Button Save = new Button();
                                            Save.setLayoutX(1000);
                                            Save.setLayoutY(950);
                                            Save.setText("Save");
                                            root.getChildren().add(Save);
                                            Label QPage2 = new Label("Quote Page 2/2");
                                            //  CurrentUser.setText(UserName);
                                            QPage2.setLayoutX(900);
                                            QPage2.setLayoutY(0);
                                            root.getChildren().add(QPage2);
                                            Save.setOnAction(new EventHandler<ActionEvent>() {

                                                @Override
                                                public void handle(ActionEvent event) {
                                                    //prompts if complete or incomplete
                                                }

                                            });
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
                                            Button Back = new Button();
                                            Back.setLayoutX(900);
                                            Back.setLayoutY(950);
                                            Back.setText("Back");
                                            root.getChildren().add(Back);
                                            Back.setOnAction(new EventHandler<ActionEvent>() {

                                                @Override
                                                public void handle(ActionEvent event) {
                                                    stage.setScene(scene2);
                                                }

                                            });

                                            Button Exit = new Button();
                                            Exit.setLayoutX(800);
                                            Exit.setLayoutY(950);
                                            Exit.setText("Exit");
                                            root.getChildren().add(Exit);
                                            Exit.setOnAction(new EventHandler<ActionEvent>() {

                                                @Override
                                                public void handle(ActionEvent event) {
                                                    System.exit(0);
                                                }

                                            });

                                        }

                                    });
                                    Button Save = new Button();
                                    Save.setLayoutX(1000);
                                    Save.setLayoutY(950);
                                    Save.setText("Save");
                                    root.getChildren().add(Save);
                                    Save.setOnAction(new EventHandler<ActionEvent>() {

                                        @Override
                                        public void handle(ActionEvent event) {
                                            //prompts if complete or incomplete
                                        }

                                    });
                                    Button Back = new Button();
                                    Back.setLayoutX(900);
                                    Back.setLayoutY(950);
                                    Back.setText("Back");
                                    root.getChildren().add(Back);
                                    Back.setOnAction(new EventHandler<ActionEvent>() {

                                        @Override
                                        public void handle(ActionEvent event) {
                                            stage.setScene(scene1);
                                        }

                                    });

                                    Button Exit = new Button();
                                    Exit.setLayoutX(800);
                                    Exit.setLayoutY(950);
                                    Exit.setText("Exit");
                                    root.getChildren().add(Exit);
                                    Exit.setOnAction(new EventHandler<ActionEvent>() {

                                        @Override
                                        public void handle(ActionEvent event) {
                                            System.exit(0);
                                        }

                                    });

                                }

                            });

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

                            final ScrollBar sc = new ScrollBar();

                            root.getChildren().addAll(sc);

                            sc.setLayoutX(400);
                            sc.setLayoutY(75);
                            sc.setMin(0);
                            sc.setOrientation(Orientation.VERTICAL);
                            sc.setPrefHeight(180);
                            sc.setMax(500);

                            stage.show();

                        }

                    });

                }

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

                System.out.println("almost a yayaya");

            }
        });

        Button NewUser = new Button();
        NewUser.setLayoutX(50);
        NewUser.setLayoutY(25);
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

        Label Username = new Label("Username : ");

        Username.setLayoutX(750);
        Username.setLayoutY(400);
        root.getChildren().add(Username);

        TextField UserInput = new TextField();
        UserInput.setLayoutX(850);
        UserInput.setLayoutY(400);
        UserInput.getText();
        UserName = UserInput.getText();
        root.getChildren().add(UserInput);

        Label Password = new Label("Password : ");

        Password.setLayoutX(750);
        Password.setLayoutY(500);
        root.getChildren().add(Password);

        PasswordField PassWord = new PasswordField();
        PassWord.setLayoutX(850);
        PassWord.setLayoutY(500);

        PassWord.getText();
        Pass = PassWord.getText();
        root.getChildren().add(PassWord);

        Label LoginPage = new Label("Login Page ");

        LoginPage.setLayoutX(900);
        LoginPage.setLayoutY(0);
        root.getChildren().add(LoginPage);

        stage.show();

    }

    public String getPassWord() {
        return Pass;
    }

    public void setPassWord(String PassWord) {
        this.Pass = PassWord;
    }

    public boolean isLoginMain() {
        return LoginMain;
    }

    public void setLoginMain(boolean LoginMain) {
        this.LoginMain = LoginMain;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void handle(ActionEvent event) {

    }

    public static void main(String[] args) {
        launch(args);
    }
    boolean LoginMain;
    String UserName;
    String Pass;
    Stage stage;

}
