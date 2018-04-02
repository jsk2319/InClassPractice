import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;

public class Exercise2_9 extends Application{

    public void start(Stage primaryStage){

        TextInputDialog vZero = new TextInputDialog();
        vZero.setTitle("Enter Input");
        vZero.setHeaderText("Acceleration Calculator");
        vZero.setContentText("Enter v0");
        Optional<String> value1 = vZero.showAndWait();
        String vZ = value1.get();

        TextInputDialog vOne = new TextInputDialog();
        vOne.setTitle("Enter Input");
        vOne.setHeaderText("Acceleration Calculator");
        vOne.setContentText("Enter v1");
        Optional<String> value2 = vOne.showAndWait();
        String vO = value2.get();

        TextInputDialog tInput = new TextInputDialog();
        tInput.setTitle("Enter Input");
        tInput.setHeaderText("Acceleration Calculator");
        tInput.setContentText("Enter t");
        Optional<String> value3 = tInput.showAndWait();
        String tI = value3.get();

        double doubleT = Double.parseDouble(tI) ;
        double doubleVZero = Double.parseDouble(vZ);
        double doubleVOne = Double.parseDouble(vO);


        double answer = doubleVOne - doubleVZero / doubleT;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Amount In Change");
        alert.setContentText("The acceleration is " + answer);
        alert.showAndWait();
    }
}