package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Orders {

    private static int globalOrderID = 0;
    private int orderID;
    private  String describe;
    private  double price;
    private  String customerAccount;
    private  String assistantAccount;
    private Car repairCar;

    public Orders(String customerAccount,String assistantAccount,Car repairCar,double price,String describe){
        globalOrderID++;
        orderID = globalOrderID;
        this.customerAccount=customerAccount;
        this.assistantAccount=assistantAccount;
        this.repairCar=repairCar;
        this.price=price;
        this.describe=describe;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getAssistantAccount() {
        return assistantAccount;
    }

    public void setAssistantAccount(String assistantAccount) {
        this.assistantAccount = assistantAccount;
    }

    public Car getRepairCar() {
        return repairCar;
    }

    public void setRepairCar(Car repairCar) {
        this.repairCar = repairCar;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }



}
