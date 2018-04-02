import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.util.Optional;
import java.lang.*;
import javafx.scene.control.Alert;

    public class Converter extends Application {

        public void start(Stage primaryStage) {

            TextInputDialog baseN = new TextInputDialog();
            baseN.setTitle("Enter Input");
            baseN.setHeaderText("Hexadecimal and Binary Converter");
            baseN.setContentText("Enter a number and it will be converted to binary and hexadecimal.");
            Optional<String> value1 = baseN.showAndWait();
            String inputN = value1.get();

            long numberD = Long.parseLong(inputN);

            Integer numberI = Integer.parseInt(inputN);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Conversion");
            alert.setContentText("Your number in hexadecimal is " + Long.toHexString(numberD) + " " + "\nYour number in binary is " + Integer.toBinaryString(numberI));
            alert.showAndWait();


        }

    }
