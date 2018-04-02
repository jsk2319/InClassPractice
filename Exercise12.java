import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        System.out.println("Enter numbers separated by spaces. End the series with a zero and then hit enter. The numbers you entered will be added.");

        Scanner keyboard = new Scanner(System.in);

        double value = 0.0;
        double sum = 0.0;


        do {


            value = keyboard.nextDouble();

            sum += value;


        } while(value != 0);


        System.out.println("The sum is of what you entered is " + sum);

    }

}
