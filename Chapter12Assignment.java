import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.application.Application;
import java.util.Optional;

public class Chapter12Assignment extends Application {

    public void start(Stage primaryStage) {


        TextInputDialog firstInput = new TextInputDialog();
        firstInput.setTitle("Enter Input");
        firstInput.setHeaderText("Addition Application");
        firstInput.setContentText("Enter a series of numbers separated by spaces.");
        Optional<String> value = firstInput.showAndWait();
        String beforeIn = value.get();

        int theNumbers = Integer.parseInt(beforeIn);

        int number;

        int sum = 0;

        do {

            number = theNumbers;
            sum+= number;

        }while(number != 0);

        Alert alert0 = new Alert(Alert.AlertType.INFORMATION);
        alert0.setTitle("Output");
        alert0.setContentText("The sum is " + sum);
        alert0.showAndWait();

    }
}