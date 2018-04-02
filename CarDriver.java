import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args){

        Scanner keyBoard = new Scanner(System.in);
        Car userCar = new Car();
        System.out.println("What is the make of your car?");
        userCar.make = keyBoard.next();
        System.out.println("What is the model of your car?");
        userCar.model = keyBoard.next();
        System.out.println("What is the year of your car?");
        userCar.year = keyBoard.nextInt();


        System.out.println("Make: " + userCar.make);
        System.out.println("Model: " + userCar.model);
        System.out.println("Year: " + userCar.year);
    }
}
