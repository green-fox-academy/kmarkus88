public class IncrementElement {
    public static void main(String[] args) {
        //Create an array variable named `t`
        //with the following content: `[1, 2, 3, 4, 5]`
        //Increment the third element
        //Print the third element

        int[] t = {1, 2, 3, 4, 5};

        t[2] = t[2] += 2;

        System.out.println("Increment t is " + t[2]);

    }
}
