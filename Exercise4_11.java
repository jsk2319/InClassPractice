import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.application.Application;
import java.util.Optional;


public class Exercise4_11 extends Application {

    public void start(Stage primaryStage) {


        TextInputDialog firstInput = new TextInputDialog();
        firstInput.setTitle("Enter Input");
        firstInput.setHeaderText("Integer to Hex Converter");
        firstInput.setContentText("Enter a number between 0 and 15. Your input will be converted to hex.");
        Optional<String> value = firstInput.showAndWait();
        String beforeInt = value.get();

        Integer userInput =  Integer.parseInt(beforeInt);

        if (userInput == 0) {

            Alert alert0 = new Alert(Alert.AlertType.INFORMATION);
            alert0.setTitle("Output");
            alert0.setContentText("The output is 0.");
            alert0.showAndWait();


        }if (userInput == 1) {
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Output");
            alert1.setContentText("The output is 1.");
            alert1.showAndWait();

        }if (userInput == 2) {
            Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
            alert2.setTitle("Output");
            alert2.setContentText("The output is 2.");
            alert2.showAndWait();

        }if (userInput == 3) {

            Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
            alert3.setTitle("Output");
            alert3.setContentText("The output is 3.");
            alert3.showAndWait();

        }if (userInput == 4) {

            Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
            alert4.setTitle("Output");
            alert4.setContentText("The output is 4.");
            alert4.showAndWait();

        }if (userInput == 5) {

            Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
            alert5.setTitle("Output");
            alert5.setContentText("The output is 5.");
            alert5.showAndWait();

        }if (userInput == 6) {

            Alert alert6 = new Alert(Alert.AlertType.INFORMATION);
            alert6.setTitle("Output");
            alert6.setContentText("The output is 6.");
            alert6.showAndWait();

        }if (userInput == 7) {

            Alert alert7 = new Alert(Alert.AlertType.INFORMATION);
            alert7.setTitle("Output");
            alert7.setContentText("The output is 7.");
            alert7.showAndWait();

        }if (userInput == 8) {

            Alert alert8 = new Alert(Alert.AlertType.INFORMATION);
            alert8.setTitle("Output");
            alert8.setContentText("The output is 8.");
            alert8.showAndWait();

        }if (userInput == 9) {

            Alert alert9 = new Alert(Alert.AlertType.INFORMATION);
            alert9.setTitle("Output");
            alert9.setContentText("The output is 9.");
            alert9.showAndWait();

        }if (userInput == 10) {

            Alert alert10 = new Alert(Alert.AlertType.INFORMATION);
            alert10.setTitle("Output");
            alert10.setContentText("The output is A.");
            alert10.showAndWait();

        }if (userInput == 11) {

            Alert alert11 = new Alert(Alert.AlertType.INFORMATION);
            alert11.setTitle("Output");
            alert11.setContentText("The output is B.");
            alert11.showAndWait();

        }if (userInput == 12) {

            Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
            alert12.setTitle("Output");
            alert12.setContentText("The output is C.");
            alert12.showAndWait();

        }if (userInput == 13) {

            Alert alert13 = new Alert(Alert.AlertType.INFORMATION);
            alert13.setTitle("Output");
            alert13.setContentText("The output is D.");
            alert13.showAndWait();

        }if (userInput == 14) {

            Alert alert14 = new Alert(Alert.AlertType.INFORMATION);
            alert14.setTitle("Output");
            alert14.setContentText("The output is E.");
            alert14.showAndWait();

        }if (userInput == 15) {

            Alert alert15 = new Alert(Alert.AlertType.INFORMATION);
            alert15.setTitle("Output");
            alert15.setContentText("The output is F.");
            alert15.showAndWait();



        }else
            System.out.println("You have to enter an integer between 0 and 15.");

    }

}