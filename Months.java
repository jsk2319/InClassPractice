import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.application.Application;
import java.util.Random;

public class Months extends Application {

    public void start(Stage primaryStage) {

        Random rand = new Random();

        int monthNumber = rand.nextInt(12) + 1;

        Alert alert = new Alert(Alert.AlertType.INFORMATION) ;
        alert.setTitle("Month");
        alert.setContentText("A random number between 1 and 12 will be generated. The number chosen and the month according to it will be displayed.");
        alert.showAndWait();


        if (monthNumber == 1) {
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 1, so the month is January.");
        alert.showAndWait();

        }if (monthNumber == 2) {
        Alert alert2 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 2, so the month is Febuary.");
        alert.showAndWait();

        }if (monthNumber == 3) {

        Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 3, so the month is March.");
        alert.showAndWait();

        }if (monthNumber == 4) {

        Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 4, so the month is April.");
        alert.showAndWait();

        }if (monthNumber == 5) {

        Alert alert5 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 5, so the month is May.");
        alert.showAndWait();

        }if (monthNumber == 6) {

        Alert alert6 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 6, so the month is June.");
        alert.showAndWait();

        }if (monthNumber == 7) {

        Alert alert7 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 7, so the month is July.");
        alert.showAndWait();

        }if (monthNumber == 8) {

        Alert alert8 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 8, so the month is August.");
        alert.showAndWait();

        }if (monthNumber == 9) {

        Alert alert9 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 9, so the month is September.");
        alert.showAndWait();

        }if (monthNumber == 10) {

        Alert alert10 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 10, so the month is October.");
        alert.showAndWait();

        }if (monthNumber == 11) {

        Alert alert11 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 11, so the month is November.");
        alert.showAndWait();

        }if (monthNumber == 12) {

        Alert alert12 = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Month");
        alert.setContentText("The number was 12, so the month is December.");
        alert.showAndWait();

        }else
        System.out.println("Oh wow something went wrong!");

        }

}
