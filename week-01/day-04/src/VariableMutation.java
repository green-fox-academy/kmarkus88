public class VariableMutation {

    public static void main(String[] args) {

        int a = 3;
        // make it bigger by 10

        System.out.println(a + 10);


        int b = 100;
        // make it smaller by 7


        System.out.println(b - 7);


        int c = 44;
        // please double c's value


        System.out.println(c * 2);


        int d = 125;
        // please divide by 5 d's value


        System.out.println(d / 5);


        int e = 8;
        // please cube of e's value
        int square = (int) Math.pow(e, 2);

        System.out.println(square);


        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        if (f1 >= f2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if (g1 <= (g2 * 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        System.out.print(h / 11.0 + " ");

        if (h % 11 == 0) {
            System.out.println("Divisor");
        } else {
            System.out.println("Not divisor");
        }


        int i1 = 10;
        int i2 = 3;
        int square2 = (int) Math.pow(i2, 2);
        int cube = (int) Math.pow(i2, 3);

        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        if (i1 > square2 && i1 < cube) {
            System.out.println("h1 is bigger then h2 squared and smalle then h2 cubed");


            int j = 1521;
            // tell if j is dividable by 3 or 5 (print as a boolean)
            if (j % 3 == 0) {
                System.out.println("Harommal oszthato");
            } else if (j % 5 == 0){
                System.out.println("Ottel oszthato");
            }else {
                System.out.println("Egyikkel sem oszthato");
            }

            String k = "Apple";
            //fill the k variable with its cotnent 4 times
            k += "AppleAppleApple";

            System.out.println(k);
        }
    }
}
