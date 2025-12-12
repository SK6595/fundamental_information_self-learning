// public class 注文 {
//   int 注文番号;
//   String 注文日;
//   int 注文数;
// }
public class 注文 {
  private int orderID; //注文番号
  private int customerID; //顧客番号
  private int productID; //商品番号
  private int amount; //個数

  public int getOrderID() {
    return orderID;
  }

  public void setOrderID(int orderID) { //公開メソッド
    this.orderID = orderID; //「this」は「自分自身」という意味。
  }
}
