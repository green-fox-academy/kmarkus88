import java.util.stream.IntStream;

public class SumAllElements {
    public static void main(String[] args) {
        // - Create an array variable named `ai`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Print the sum of the elements in `ai`
        int[] ai = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < ai.length; i++) {
            sum = sum + ai[i];
        }
        System.out.println(sum);

        //OR

         int[] ai2 = {3, 4, 5, 6 ,7};
         int sum2 = IntStream.of(ai2).sum();
         System.out.println("Second solution is: " + sum2);
    }
}