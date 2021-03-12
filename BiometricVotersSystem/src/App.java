package BiometricVotersSystem.src;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.*;


public class App extends Application {

    public static ArrayList<Integer> voters = new ArrayList<Integer>(); 
    Stage window;
    Scene scene1, scene2, scene3, scene4;

    Button button;
    

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        window = primaryStage;
    

        // layout1
        GridPane mainpage = new GridPane();
        mainpage.setAlignment(Pos.CENTER);
        mainpage.setHgap(10);
        mainpage.setVgap(10);
        mainpage.setPadding(new Insets(25, 25, 25, 25));    

        Text title = new Text("BIOMETRIC VOTERS SYSTEM");
        title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        mainpage.add(title, 0, 0, 2, 1);


        Button signUp = new Button("Sign Up");
        Button login = new Button("Login");

        signUp.setOnAction(e -> window.setScene(scene2));
        login.setOnAction(e -> window.setScene(scene3));

        HBox hBtn = new HBox(10);
        hBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hBtn.getChildren().addAll(signUp, login);
        mainpage.add(hBtn, 1, 4);

        

        
        scene1 = new Scene(mainpage, 500, 500);

        // Button 2
        Button back = new Button("Back >");
        back.setOnAction(e -> window.setScene(scene1));

        Button rt = new Button("Back >");
        rt.setOnAction(e -> window.setScene(scene1));


        // sign up page
        GridPane signUpPage = new GridPane();
        signUpPage.setAlignment(Pos.CENTER);
        signUpPage.setHgap(10);
        signUpPage.setVgap(10);
        signUpPage.setPadding(new Insets(25, 25, 25, 25));

        Text intro = new Text("Sign Up Page");
        intro.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        signUpPage.add(intro, 0, 0, 2, 1);

        Label username = new Label("User Name:");
        signUpPage.add(username, 0, 1);

        TextField usertextField = new TextField();
        signUpPage.add(usertextField, 1, 1);

        Label voterID = new Label("Voter ID:");
        signUpPage.add(voterID, 0, 2);

        TextField IDTextField = new TextField();
        signUpPage.add(IDTextField, 1, 2);

        Label pword = new Label("Registration Center: ");
        signUpPage.add(pword, 0, 3);

        TextField pwBoxx = new TextField();
        signUpPage.add(pwBoxx, 1, 3);

        Label age = new Label("Age: ");
        signUpPage.add(age, 0, 3);

        TextField ageField = new TextField();
        signUpPage.add(ageField, 1, 3);

        Button bbtn = new Button("Sign Up");
        bbtn.setOnAction(e -> {
            String name = usertextField.getText();
            int Userage = Integer.parseInt(ageField.getText());
            String pol = pwBoxx.getText();
            int ID = Integer.parseInt(IDTextField.getText());

            Voter v1 = new Voter(name, Userage, ID, pol);
            voters.add(v1.getId());

            window.setScene(scene4);
        });
        HBox hbbBtn = new HBox(10);
        hbbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbbBtn.getChildren().addAll(bbtn, rt);
        signUpPage.add(hbbBtn, 1, 4);

        
        scene2 = new Scene(signUpPage, 500, 500);

        // login page
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));    

        Text scenetitle = new Text("LOGIN");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("ID:");
        grid.add(pw, 0, 2);

        TextField pwBox = new TextField();
        grid.add(pwBox, 1, 2);

        Label l = new Label("");
        grid.add(l, 1, 3);

        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        btn.setOnAction(e -> {
            int a = Integer.parseInt(pwBox.getText());
            
            if (voters.contains(a)) {
                window.setScene(scene4);
            }
            else if (pwBox.getText() == ""){
                l.setText("Enter your details!");
            }
             else {
                l.setText("Incorrect user info, kindly sign up");
                window.setScene(scene2);
            }
            
        });
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().addAll(btn, back);
        grid.add(hbBtn, 1, 4);


        scene3 = new Scene(grid, 500, 500);


        // voting dashboard

        GridPane vote = new GridPane();
        vote.setAlignment(Pos.CENTER);
        vote.setHgap(10);
        vote.setVgap(10);
        vote.setPadding(new Insets(25, 25, 25, 25));

        Text intText = new Text("Choose Your Candidate!");
        intText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        vote.add(intText, 0, 0, 2, 1);

        ToggleGroup group = new ToggleGroup();

        RadioButton c1 = new RadioButton("NPP: Nana Akuffo Addo");
        c1.setToggleGroup(group);
        vote.add(c1, 1, 1);

        RadioButton c2 = new RadioButton("NDC: John Mahama");
        c2.setToggleGroup(group);
        vote.add(c2, 1, 2);

        RadioButton c3 = new RadioButton("CPP: John Kata");
        c3.setToggleGroup(group);
        vote.add(c3, 1, 3);

        Button submit = new Button("Submit");
        HBox subtn = new HBox(10);
        //submit.setOnAction(e -> window.setScene(scene3));
        subtn.setAlignment(Pos.BOTTOM_RIGHT);
        subtn.getChildren().add(submit);
        vote.add(subtn, 1, 4);

        scene4 = new Scene(vote, 500, 500);


        //submit.setOnAction();

        
        window.setScene(scene1);
        window.setTitle("Biometric System");
        window.show();
        
    }

    
}
