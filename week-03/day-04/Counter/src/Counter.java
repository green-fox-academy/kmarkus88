public class Counter {

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