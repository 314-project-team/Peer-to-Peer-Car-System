package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */


import org.junit.jupiter.api.Order;

import java.util.ArrayList;

public class Customer  extends User{

    private boolean isMember;
    private Car     car;
    private double  balance;
    private ArrayList<Orders> historyOrder; //auto-generate List during the constructor build



    public Customer(String name, int age, String account, String password, Car car) {
        super(name, age, account, password);
        this.car = car;  //only car generate......
        this.balance =0;
        historyOrder=new ArrayList<Orders>();
    }

    public Customer(String name, int age, String account, String password, double longitude, double latitude, Car car) {
        super(name, age, account, password, longitude, latitude);
        this.car = car;
        this.balance = balance;
        historyOrder=new ArrayList<Orders>();
    }


    public boolean getIsMember(){
        return this.isMember;
    }

    public Car getMyCar(){
        return this.car;
    }

    public ArrayList<Orders> getHistoryOrder(){
        return this.historyOrder;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setMember(boolean authority){
        this.isMember=authority;
    }

    public void setMyCar(Car car){
        this.car=car;
    }

    public void setHistoryOrder(ArrayList<Orders> historyOrder){
        this.historyOrder=historyOrder;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }



    public Orders orderService(){//首先产生一个只有Customer信息的Order表


        /*这个方法只生产一个只填写Customer信息的Order表*/

        changeCarStatusToBroken();//首先改变Car的状态 Well-->Broken

        Orders order=new Orders(this.getAccount(),this.getMyCar());

      //  Orders order=new Orders(this.getAccount(),this.getMyCar(),assistant.getAccount(),assistant.setOrderPrice(),assistant.setOrderDescription(this));
        return order;

//        String cAccount = getAccount();
//        String aAccount = "null";
//        Car myCar = new Car(car.getRego(),car.getColor(),car.getBrand(),car.getStatus(),car.getDescribe(),car.getAccount());
//        double price = 0;
//        String describe = "null";
//        Orders o = new Orders(cAccount,aAccount,myCar,price,describe);
//        return o;
    }





    public void changeCarStatusToBroken(){
    getMyCar().setStatus("Broken");

    }



    @Override
    public String toString() {
        return "Customer{" +
                "isMember=" + isMember +
                " name: " + super.getName();
    }

    public void addHistoryOrder(Orders order){
        historyOrder.add(order);
    }
}






