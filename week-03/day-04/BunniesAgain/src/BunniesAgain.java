public class BunniesAgain {
    public static void main(String[] args) {

        System.out.println(bunnyEar(9));
    }
    private static int bunnyEar(int bunnyNumber) {
        int bunnyEars = 2;
        if (bunnyNumber == 1) {
            return bunnyEars;
        } else {
            if (bunnyNumber % 2 == 0) {
                return bunnyEars + 1 + bunnyEar(bunnyNumber - 1);
            } else {
                return bunnyEars + bunnyEar(bunnyNumber - 1);
            }
        }
    }
}
 /*       System.out.println(bunnyEarCounter(50));
    }

    private static int bunnyEarCounter(int bunnyNumber) {
        int bunnyEars = 2;
        if (bunnyNumber == 1) {
            return bunnyEars;
        } else {
            return bunnyEars + bunnyEarCounter(bunnyNumber - 1);
        }
    }
*/