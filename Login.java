import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.*;

public class Login extends Application {

    public void start (Stage primaryStage){
        //Correct information
        final String correctUser = "Jude";
        final String correctPass = "CSC";

        //User entering username
        TextInputDialog userName = new TextInputDialog();
        userName.setTitle("Login");
        userName.setContentText("Enter username.");
        Optional<String> userInput = userName.showAndWait();
        String uInput = userInput.get();

        //User entering password
        TextInputDialog passWord = new TextInputDialog();
        passWord.setTitle("Login");
        passWord.setContentText("Enter password.");
        Optional<String> passInput = passWord.showAndWait();
        String pInput = passInput.get();

        //If user name and password are correct
        if (correctUser.equals(uInput) && correctPass.equals(pInput)) {

            Alert alertWelcome = new Alert(Alert.AlertType.INFORMATION);
            alertWelcome.setTitle("Welcome.");
            alertWelcome.setContentText("Welcome, Jude.");
            alertWelcome.showAndWait();

        //If username and/or password are incorrect
        }else{
            Alert alertInvalid = new Alert(Alert.AlertType.INFORMATION);
            alertInvalid.setTitle("Invalid");
            alertInvalid.setContentText("Invalid username or password.");
            alertInvalid.showAndWait();
        }

    }

}
