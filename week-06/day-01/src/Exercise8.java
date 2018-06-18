import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    System.out.println(getNumbersFrequency(numbers));

  }
  private static Map<Integer, Long> getNumbersFrequency(List<Integer> numbers) {
    return numbers.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }
}
