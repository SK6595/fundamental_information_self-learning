// public class 注文 {
//   int 注文番号;
//   String 注文日;
//   int 注文数;
// }
public class 注文 extends 共通 {
 
  private int customerID; //顧客番号
  private int productID; //商品番号
  private int amount; //個数
  
  public int getId() {
    return customerID;
  }
  
  public void setId(int customerID) { 
    this.customerID = customerID;
  }

  public int getId() {
    return orderID;
  }

  public void setId(int orderID) { 
    this.orderID = orderID;
  }
  
  public int getId() {
    return productID;
  }
  
  public void setId(int productID) {
    this.productID = productID;
  }
  
  public int getAmount() {
    return amount;
  }
  
  public void setAmount(int amount) {
    this.amount = amount;
  }
}
