package program_nature;

public class recursive {
  public static void main(String[] args) {
    sub(1000);
  }
  
  private static void sub(int value) {
    System.out.println(value);
    int(value <= 500) return;
    sub(value - 1);
  }
}