import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzbuzzTest{
  @Test
  public void returnsOneIfGivenOne() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    String result = fizzbuzz.getResult(1);
    assertEquals("1", result);
  }

  @Test
  public void returnsTwoIfGivenTwo() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    String result = fizzbuzz.getResult(2);
    assertEquals("2", result);
  }

  @Test
  public void returnsFizzIfGivenThree() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    String result = fizzbuzz.getResult(3);
    assertEquals("Fizz", result);
  }

  @Test
  public void returnsBuzzIfGivenFive() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    String result = fizzbuzz.getResult(5);
    assertEquals("Buzz", result);
  }

  @Test
  public void returnsFizzBuzzIfGivenFifteen() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    String result = fizzbuzz.getResult(15);
    assertEquals("FizzBuzz", result);
  }
}
