import java.util.Scanner;

public class Feb12Math {

    public static void main (String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double array[] = new double[10];
        System.out.println("Enter 10 numbers and they will be added, averaged, divided, and multiplied.");
        double sum = 0;
        double divide;
        double multiply;
        double average;

        for (int i = 0; i < 10; i++) {
            array[i] = keyboard.nextDouble();
            sum = sum + array[i];
        }
        multiply = array[1]*array[2]*array[3]*array[4]*array[5]*array[6]*array[7]*array[8]*array[9]*array[0];
        divide = array[1]/array[2]/array[3]/array[4]/array[5]/array[6]/array[7]/array[8]/array[9]/array[0];
        average = sum/10;
        System.out.print("The sum is " + sum + " multiplied is " + multiply + " divided is " + divide + " the average is " + average);
    }

}