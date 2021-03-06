import java.util.ArrayList;

public class Sum {

  public Integer sumElements(ArrayList<Integer> numbers) {
    int sum = 0;
    if (numbers == null) {
      return 0;
    }
    for (Integer number : numbers ) {
      sum += number;
    }
    return sum;
  }
}
