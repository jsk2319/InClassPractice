import java.lang.*;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;

public class FullName extends Application {

    public void start(Stage primaryStage) {

        TextInputDialog vZero = new TextInputDialog();
        vZero.setTitle("Full Name");
        vZero.setHeaderText("Enter Name");
        vZero.setContentText("Enter your full name.");
        Optional<String> userInput = vZero.showAndWait();
        String uInput = userInput.get();



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Amount In Change");
        alert.setContentText("Welcome " + uInput);
        alert.showAndWait();

    }

}