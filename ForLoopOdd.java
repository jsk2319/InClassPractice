public class ForLoopOdd {
    public static void main(String[] args) {
        //limit
        int limit = 100;

        //for loop that prints odd numbers within the limit
        for(int i=1; i<= limit; i++) {
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }

    }
}
