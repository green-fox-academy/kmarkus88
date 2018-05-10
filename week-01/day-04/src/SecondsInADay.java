public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int remainingHours = 24 - currentHours;
        int remainingMinutes = 60 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;

        int remainingSecondsADay;

        System.out.println(remainingHours+ " hours " + remainingMinutes + " minutes " + remainingSeconds + " seconds");

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        remainingSecondsADay = remainingHours * 60 * 60 + remainingMinutes * 60 + remainingSeconds;
        System.out.println(remainingSecondsADay + " second is left from this day.");
    }
}