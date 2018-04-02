public class Time {

        long millisecond = 1000;
        long second = (millisecond / millisecond) % 60;
        long minute = (millisecond/(millisecond * 60)) % 60;
        long hour = (millisecond/(millisecond * 60 * 60)) % 24;

}
