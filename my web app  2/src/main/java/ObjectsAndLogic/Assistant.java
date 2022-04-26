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
    private boolean isPass;


    private double balance;

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

    // new new new new new new new new new new new new new new new new new new new new new new new new new new
    public Assistant(String account, String name, int age, String password, boolean isPass, boolean isFree, double longitude, double latitude, double balance) {
        super(name, age, account, password, longitude, latitude);
        this.isFree = isPass;
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

    public void setRemainingAmount(double balance) {
        this.balance = balance;
    }


    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }


    //=====================need others Class=========================
    public void confirmOrder(Customer customer) {

    }

    public void completeOrder(Customer customer) {

    }

    public void setOrderDescription() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your Description:");

    }

    public void setOrderPrice() {

    }

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

}

