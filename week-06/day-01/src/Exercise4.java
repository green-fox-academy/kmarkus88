import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5, 1));

    System.out.println(getNumbersWhereSquaredSumIsBigger20(numbers));
  }
  private static List<Integer> getNumbersWhereSquaredSumIsBigger20(List<Integer> numbers) {
    return numbers.stream()
            .mapToInt(n -> n)
            .map(n -> n * n)
            .filter(n -> n > 20)
            .boxed()
            .collect(Collectors.toList());
  }
}
