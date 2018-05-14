public class FunctionExamples {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        float average = average(numbers);
        System.out.println(average);

        int n = 3;
        increaseNumber(n);
        System.out.println(n);

        //increaseElement(numbers);

        //System.out.println(increaseNumber(2));
    }

   // public static [] increaseElement(int[] numbers) {
    //    for (int i = 0; i < numbers.length; i++) {
     //       ++numbers[i];
      //  }
      //  return;
   // }

    public static int increaseNumber(int number) {
        return ++number;

    }

    public static float average(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum / (float)numbers.length;
    }
}
