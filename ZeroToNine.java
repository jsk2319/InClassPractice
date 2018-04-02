import java.util.Random;

public class ZeroToNine {

    public static void main(String[] args) {
        int counter = 0;
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;
        int sevens = 0;
        int eights = 0;
        int nines = 0;

        do {
            Random rand = new Random();
            int useForAll = rand.nextInt(9);
            counter ++;

            if (useForAll == 0){
                zeros ++;
            }if (useForAll == 1) {
                ones ++;
            } if (useForAll == 2) {
                twos ++;
            } if (useForAll == 3) {
                threes ++;
            } if (useForAll == 4) {
                fours ++;
            } if (useForAll == 5) {
                fives ++;
            } if (useForAll == 6) {
                sixes ++;
            } if (useForAll == 7) {
                sevens ++;
            } if (useForAll == 8) {
                eights ++;
            } if (useForAll == 9) {
                nines ++;
            }

            float f = -34;
            float t = 34.0;

        }while (counter < 100); {
            System.out.println("Zero was picked " + zeros + " times." +
                    "\nOne was picked " + ones + " times." +
                    "\nTwo was picked " + twos + " times." +
                    "\nThree was picked " + threes + " times." +
                    "\nFour was picked " + fours + " times." +
                    "\nFive was picked " + fives + " times." +
                    "\nSix was picked " + sixes + " times." +
                    "\nSeven was picked " + sevens + " times." +
                    "\nEight was picked " + eights + " times." +
                    "\nNine was picked " + nines + " times.");
        }
    }
}
