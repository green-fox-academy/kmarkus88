public class Summing {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.
        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

                int NoNumbers = 8;

                //sum(noOfNumbers);

                System.out.println(sum(NoNumbers));


            }

            public static int sum(int numbers){

                int sum = 0;

                for (int i = 1; i < numbers+1; i++) {
                    sum += i;
                }

                return sum;

    }
}