import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise2 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

    System.out.println(getAverageOfOddNumbers(numbers));
  }
  private static double getAverageOfOddNumbers(List<Integer> numbers) {
    return numbers.stream()
            .filter(n -> n % 2 != 0)
            .mapToInt(n -> n)
            .average()
            .getAsDouble();
  }
}
