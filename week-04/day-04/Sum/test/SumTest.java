import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void with_multiple_elements() {
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

    Integer expectedResult = 0;

    assertEquals(expectedResult, sumOfTheElements.sumElements(numbers));
  }

  @Test
  public void with_one_element() {
    Sum sumOfTheElements = new Sum();
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(88);

    Integer expectedResult = 88;

    assertEquals(expectedResult, sumOfTheElements.sumElements(numbers));
  }

  @Test
  public void with_null() {
  Sum sumOfTheElements = new Sum();
  ArrayList<Integer> numbers = null;

  Integer expectedResult = 0;

  assertEquals(expectedResult, sumOfTheElements.sumElements(numbers));
  }
}