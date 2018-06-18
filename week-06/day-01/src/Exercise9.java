import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise9 {
  public static void main(String[] args) {

    Character[] chars = {'k','u','t','y','a'};
    System.out.println(getCharsToString(chars));
  }
  private static String getCharsToString(Character[] chars) {
    return Arrays.stream(chars)
            .map(c -> Character.toString(c))
            .reduce((text, word) -> text + word)
            .get();
  }
}
