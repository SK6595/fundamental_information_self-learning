import java.util.ArrayDeque;
import java.util.Deque;
public class stackAndQueue {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();

    deque.push("A");
    deque.push("B");
    deque.push("C");
    deque.push("D");

    System.out.println(deque.pop());
    System.out.println(deque.pop());
    System.out.println(deque.pop());
    System.out.println(deque.pop());
  }
}