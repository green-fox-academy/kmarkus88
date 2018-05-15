public class Reverse {
    public static void main(String[] args) {
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        int a = reversed.length();
        String output = "";

        for (int i = a - 1; i > -1; i--) {

            output = output + reversed.charAt(i);

        }
        System.out.println(output);

        //2nd solution

        String reverse = new StringBuffer(reversed).reverse().toString();
        System.out.println("2nd Solution: " + reverse);

    }
}
