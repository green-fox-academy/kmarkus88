public class Counter {
    // Write a recursive function that takes one parameter: n and counts down from n.
    public static void main(String[] args) {

        int limit = 50;
        countDownFromN(limit);
    }

    private static int countDownFromN(int limit) {
        if (limit == 0) {
            return 0;
        } else  {
            System.out.println(limit);
            return countDownFromN(limit - 1);
        }
    }
}