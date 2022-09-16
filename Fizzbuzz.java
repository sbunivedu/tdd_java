public class Fizzbuzz{
  public String getResult(int number) {
    if(number%3 == 0){
      return "Fizz";
    }
    return String.valueOf(number);
  }
}