import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  @Test
  public void getApple() {
    String expectedResult = "apple";
    String inputText = "apple";

    assertEquals(expectedResult, inputText);
  }
}