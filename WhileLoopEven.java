public class WhileLoopEven {
    public static void main(String[] args) {
        int limit = 100;
        int i = 2;

        while (i<limit) {
            System.out.println(i + 2 + " ");
            int even = i + 2;
            if ( i > limit) {
                break;
            }
        }

    }
}
