import java.util.ArrayList;
import java.util.List;
public class checkTimeList {
  private static final int num = 10000000;
  public static void main(String[] args) {
    long startTime;
    long endTime;
    
    List<Character> リスト = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      リスト.add('a');
    }
    startTime = System.currentTimeMillis();
    リスト.add('a');
    endTime = System.currentTimeMillis();
    System.out.println("処理時間：" + ((endTime - startTime)) + " ");
  }
}