package ObjectsAndLogic;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Assistant extends User {

    private ArrayList<Orders> historyOrder;
    private boolean isFree;
    private boolean isPass;  //boolean是false
    private double distanceToCustomer;
    private double balance;

    //为创建Candidate所设置的构造参数 
    public Assistant(String name, int age, String account, String password) {
        super(name, age, account, password);
        this.isFree = false;
        this.isPass = false;
        this.setLongitude(0);
        this.setLatitude(0);
        this.distanceToCustomer=0;
        this.balance=0;
    }

    //  private boolean ----> isPass;
    public Assistant(String name, int age, String account, String password, boolean isFree, double balance) {
        super(name, age, account, password);
        this.isFree = isFree; //AUTO ?
        this.balance = balance; //AUTO?

    }

    public Assistant(String name, int age, String account, String password, double longitude, double latitude, boolean isFree, double balance) {
        super(name, age, account, password, longitude, latitude);
        this.isFree = isFree;
        this.balance = balance;
    }

    public ArrayList<Orders> getHistoryOrder() {
        return historyOrder;
    }

    public boolean getIsFree() {
        return isFree;
    }

    public double getRemainingAmount() {
        return balance;
    }

    public void setHistoryOrder(ArrayList<Orders> historyOrder) {
        this.historyOrder = historyOrder;
    }

    public void setFree(Boolean flag) {
        isFree = flag;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }


    //=====================need others Class=========================
    public boolean confirmOrder(Customer customer) {
        return true;
    }




    public String setOrderDescription(Customer customer) {
     //Assistant 需要做一段描述，对要修复的车
     String des="Customer:"+customer.getName()+customer.getMyCar().getRego()+"Need fix\t" +
                "Assistant:"+this.getName()+"Distant:";
     return des;
    }

    public double setOrderPrice() {
        return 100;
    }//需要生辰随机数好些

    @Override
    public String toString() {
        return "Assistant{" +
                "account=" + getAccount() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", password=" + getPassword() +
                ", isPass=" + isPass +
                ", isFree=" + isFree +
                ", longitude=" + getLongitude() +
                ", latitude=" + getLatitude() +
                ", remainingAmount=" + balance +
                '}';
    }

    public double getDistanceToCustomer() {
        return distanceToCustomer;
    }

    public void setDistanceToCustomer(double distanceToCustomer) {
        this.distanceToCustomer = distanceToCustomer;
    }

    public double getBalance() {
        return balance;
    }

    public void addHistoryOrder(Orders order){
        historyOrder.add(order);
    }
}

