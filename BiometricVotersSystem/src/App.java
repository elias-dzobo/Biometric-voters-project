package BiometricVotersSystem.src;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class App extends Application {

    Stage window;
    Scene scene1, scene2;

    Button button;
    

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        window = primaryStage;

        Label header = new Label("BIOMETRIC VOTERS SYSTEM");
        
        Button signUp = new Button("Sign Up");
        Button login = new Button("Login");

        signUp.setOnAction(e -> window.setScene(scene2));

        // layout1
        VBox mainPage = new VBox(20);

        mainPage.getChildren().addAll(header, signUp, login);

        scene1 = new Scene(mainPage, 500, 500);

        // Button 2
        Button back = new Button("Back >");
        back.setOnAction(e -> window.setScene(scene1));


        // sign up page
        VBox signUpPage = new VBox(20);

        Label intro = new Label("Sign Up Page");

        Label name = new Label("Name: ");
        TextField nameField = new TextField("Name: ");
        Label id = new Label("ID: ");
        TextField voterID = new TextField("VotersID: ");
        nameField.setPrefColumnCount(10);
        voterID.setPrefColumnCount(10);
        final ToggleGroup group = new ToggleGroup();

        RadioButton r1 = new RadioButton("Voter");
        r1.setToggleGroup(group);
        RadioButton r2 = new RadioButton("Officer");
        r2.setToggleGroup(group);
        RadioButton r3 = new RadioButton("Candidate");
        r3.setToggleGroup(group);

        
        signUpPage.getChildren().addAll(intro, name, nameField, id, voterID, r1, r2, r3, back);
        
        scene2 = new Scene(signUpPage, 500, 500);
        
        window.setScene(scene1);
        window.setTitle("Biometric System");
        window.show();
        
    }

    
}
