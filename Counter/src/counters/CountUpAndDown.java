package counters;

public class CountUpAndDown {
  public static void main(String[] args) {
    int start = 0;
    int end = 5;
    countUpAndDown(start, end);
}
  public static void countUpAndDown(int start, int end)
  {
    if ( start > end  && end > 0) {
      System.out.println(end - 1);
      countUpAndDown(start, end - 1);    
  }

 
  if (start <= end) {
      System.out.println(start);
      countUpAndDown(start + 1, end);
  }
  }
}
