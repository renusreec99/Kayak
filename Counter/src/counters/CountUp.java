package counters;

public class CountUp {
  
 
  public static void main(String[] args) {
    int start = 0;
    int end = 5;
    countUp(start, end);
}
  public static void countUp(int start, int end)
  {
      System.out.println(start);
      if (start < end)
      {
          countUp(start+1, end);
      }
  }
}
