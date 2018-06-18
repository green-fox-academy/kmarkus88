import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
  public static void main(String[] args) {

    String text = "A kuTya Meg a mAcSka SZep AllaT";

    System.out.println(countUppercaseLettersInAString(text));

  }
  private static List<Character> countUppercaseLettersInAString(String text) {
    return text.chars()
            .mapToObj(item -> (char) item)
            .filter(Character::isUpperCase)
            .collect(Collectors.toList());
  }
}
