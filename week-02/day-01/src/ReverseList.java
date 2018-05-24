import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(aj));
        for (int i = aj.length - 1; i >= 0; i--);
        System.out.println(Arrays.toString(aj));
    }
}
