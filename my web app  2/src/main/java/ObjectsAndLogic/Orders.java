package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Orders {

    private  String OrderID;
    private  String describe;
    private  double price;
    private  String cu_account;
    private  String as_account;

    public Orders(String orderID, String describe, double price, String cu_account, String as_account) {
        OrderID = orderID;
        this.describe = describe;
        this.price = price;
        this.cu_account = cu_account;
        this.as_account = as_account;
    }


}
