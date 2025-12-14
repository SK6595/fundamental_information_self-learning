// public class 共通 {
//   public String formatting(int 番号) {
//     return 番号 + "番";
//   }
// }

public class 共通 {
    int id; //privateのままだと、他クラスからは参照できなくなってしまうので、公開属性にする。
  
    public int getId() { //公開メソッド
        return id;
    }
    
    public void setId(int id) {
        this.id = id;  //「this」は「自分自身」という意味。
    }
}
