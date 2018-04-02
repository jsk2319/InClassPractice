public class Driver {

    public static void main(String[] args){

        int x = 7;
        int y = 10;
        x = y;
        y = y + 1;

        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Red";
        apple.numberOfPieces = 1;

        System.out.println("Name: " + apple.name);
        System.out.println("Color: " + apple.color);
        System.out.println("Number of Pieces: " + apple.numberOfPieces);
    }
}
