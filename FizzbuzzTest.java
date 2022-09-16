public class FizzbuzzTest{
  @Test
  public void returnsOneIfGivenOne() {
    Fizzbuzz fizzbuzz = new Fizzbuzz();
    String result = fizzbuzz.getResult(1);
    assertEquals("1", result);
  }
}