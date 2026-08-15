public class checkTimeArray {
  private static final int num = 10000000;
  public static void main(String[] args) {
    long startTime;
    long endTime;

    char[] 配列 = new char[num]; // 1000万の配列

    for (int i = 0; i < num; i++) {
      配列[i] = 'a'; // 1000万個「a」を入れている
    }
    // スピードを測るのを開始している
    // 現在の時間をstartTimeという変数に保存している
    // 処理時間を出す時に使用する
    startTime = System.currentTimeMillis();
    char[] 配列2 = new char[num + 1]; // 1000万1という配列（追加のために作成）
    for (int i = 0; i < num; i++) {
      配列2[i] = 配列[i];
    }
    配列2[num] = 'a';
    endTime = System.currentTimeMillis();
    System.out.println("処理時間：" + ((endTime - startTime)) + " "); // 単位はミリ秒
  }
}