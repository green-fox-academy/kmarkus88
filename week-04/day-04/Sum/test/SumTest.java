import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void should_sumElements() {
    Sum sumOfTheElements = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    Integer expectedResult = 15;

    assertEquals(expectedResult, sumOfTheElements.sumElements(numbers));
  }

  @Test
  public void with_empty_list() {
    Sum sumOfTheElements = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();

    Integer expectedResult = 1;

    assertEquals(expectedResult, sumOfTheElements.sumElements(numbers));
  }

}