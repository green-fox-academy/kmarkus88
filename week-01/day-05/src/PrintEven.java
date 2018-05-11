public class PrintEven {
    public static void main(String[] args) {

        // Create a program that prints all the even numbers between 0 and 500
        //define the limit
        int limit = 500;

        System.out.println("Printing Odd numbers between 1 and " + limit);

        for(int i=0; i <= limit; i++){

            //if the number is not divisible by 2 then it is odd
            if( i % 2 == 0){
                System.out.println(i + " ");
            }
        }
    }
}
