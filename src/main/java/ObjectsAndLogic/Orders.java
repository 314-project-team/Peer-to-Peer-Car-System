package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Orders {

    private static int globalOrderID = 0;
    private int orderID;
    //顾客需要完善的信息
    private  String customerAccount;
    private Car repairCar;

    //assistant需要完善的信息
    private  String assistantAccount;
    private  double price;
    private  String describe;


    //我调整的一下构造参数的传参顺序，内容不变
    public Orders(String customerAccount,Car repairCar){
        globalOrderID++;
        orderID = globalOrderID;

        this.customerAccount=customerAccount;
        this.repairCar=repairCar;

    }



    //我调整的一下构造参数的传参顺序，内容不变
    public Orders(String customerAccount,Car repairCar,String assistantAccount,double price,String describe){
        globalOrderID++;
        orderID = globalOrderID;

        this.customerAccount=customerAccount;
        this.repairCar=repairCar;

        this.assistantAccount=assistantAccount;
        this.price=price;
        this.describe=describe;
    }



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
