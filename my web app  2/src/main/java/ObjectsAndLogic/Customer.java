package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
import java.util.ArrayList;
public class Customer  extends User{

    private boolean isMember;
    private Car     car;
    private double  remainingAmount;
    private ArrayList<Order> historyOrder; //auto-generate List during the constructor build



    public Customer(String name, int age, String account, String password, Car car) {
        super(name, age, account, password);
        this.car = car;  //only car generate......
        this.remainingAmount =0;
        historyOrder=new ArrayList<Order>();
    }

    public Customer(String name, int age, String account, String password, double longitude, double latitude, Car car) {
        super(name, age, account, password, longitude, latitude);
        this.car = car;
        this.remainingAmount = remainingAmount;
        historyOrder=new ArrayList<Order>();
    }

    public boolean getIsMember(){
        return this.isMember;
    }

    public Car getMyCar(){
        return this.car;
    }

    public ArrayList<Order> getHistoryOrder(){
        return this.historyOrder;
    }

    public double getRemainingAmount(){
        return this.remainingAmount;
    }

    public void setMember(boolean authority){
        this.isMember=authority;
    }

    public void setMyCar(Car car){
        this.car=car;
    }

    public void setHistoryOrder(ArrayList<Order> historyOrder){
        this.historyOrder=historyOrder;
    }

    public void setRemainingAmount(double remainingAmount){
        this.remainingAmount=remainingAmount;
    }

    public void orderService(){
        /*need Order Process Class
         * create a order Object
         *
         *
         */
        car.setStatus(CarStatus.Broken);
    }

    public void changeCarInformation(){
        //need Car Class

    }

}






