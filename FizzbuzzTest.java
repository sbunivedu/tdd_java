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
}
