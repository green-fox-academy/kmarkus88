import java.util.Arrays;

public class ArraysAndFunctions {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        String [] texts = new String[4];
        boolean [] truths = new boolean[4];
        Object o = "alma"; //az Object barmilyen tipusu lehet
        int[][] map = {
                {1, 2, 3 ,4},
                {1, 2, 3 ,4},
                {1, 2, 3 ,4},
                {1, 2, 3 ,4},
        };

        //int[][] map = new int[10][10];//tobb dimeznios tomb amennyi [] van annyi dimenzio
        //map[0][1];
          //if (o instanceof String) ezzel lehet megnezni valamit hogy olyan fajta e
         // {
         //}


        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 8;
        numbers[3] = 4;

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {3, 6 , 9 , 2}; //ide nem szukseges a new int[] szoveg | a hatterbe van new int[] de nem latszik
        int[] numbers3; //van egy uj, de nincs erteke ezert lejjebb..

        System.out.println(Arrays.toString(numbers2));

        numbers3 = new int[] {5, 8, 3, 5, 6}; //kell a new int[]

        System.out.println(Arrays.toString(numbers3));

    }
}
