import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  @Test
  public void getApple() {
    Apples apples = new Apples();
    String expectedResult = "apple";
    String result = apples.getApple();

    assertEquals(expectedResult, result);
  }
}