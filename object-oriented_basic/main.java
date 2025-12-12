public class main {
  public static void main(String[] args) {
    注文 注文1 = new 注文(); //インスタンス（オブジェクト）の生成
    
    注文1.setOrderID(1); //公開メソッド経由で非公開属性にアクセスしている。
    注文1.setProductID(53);
    注文1.setCustomerID(100);
    注文1.setAmountID(5);
  }
}