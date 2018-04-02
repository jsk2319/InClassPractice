import java.util.Scanner;
public class TelevisionDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the brand of your television?");
        String brand = keyboard.nextLine();

        Television myTV = new Television(brand);
        int option;
        do {
            System.out.println("Press 1 to change the power status of the tv");
            System.out.println("Press 2 to look at the power status of the tv");
            System.out.println("Press 3 to end the program");
            option = keyboard.nextInt();

            if(option == 1) {
                System.out.println("Press 0 to turn off or Press 1 to turn on");
                boolean power = keyboard.nextBoolean();
                myTV.setPower(power);
            }
            else if(option == 2) {
                boolean power = myTV.getPower();
                if(power == false)
                    System.out.println("The TV is off");
                else if(power == true)
                    System.out.println("The TV is on");
            }
            else if(option == 3) {
                System.out.println("Have a nice day!");
            }
            else {
                System.out.println("Error! Invalid option! Try again!");
            }

        }while(option != 3);

    }

}