package program_nature;

public class reEntrant {
  
  // 大域的
  static int result;
  
  public static void main(String[] args) {
    System.out.println(test(10));
    System.out.println(test(10));
    System.out.println(test(10));
    System.out.println(test(10));
  }
  
  private static int test(int value) {
    System.out.println(result);
    result++;
    return value * 125 + result;
  }
}