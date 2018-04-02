import java.lang.*;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;

public class Root extends Application{

    public void start(Stage primaryStage){

        TextInputDialog vZero = new TextInputDialog();
        vZero.setTitle("Enter Input");
        vZero.setHeaderText("Squareroot calculator");
        vZero.setContentText("Enter a number and it will be given the square root.");
        Optional<String> value1 = vZero.showAndWait();
        String inputN = value1.get();

        double numberF = Double.parseDouble(inputN);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Amount In Change");
        alert.setContentText("The square root of the number you entered is " + Math.sqrt(numberF));
        alert.showAndWait();

    }

}
