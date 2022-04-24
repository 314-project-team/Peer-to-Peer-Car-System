package ObjectsAndLogic;

import java.util.ArrayList;
import java.util.Scanner;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Assistant extends User {

    private ArrayList<Order> historyOrder;
    private boolean          isFree;
    private boolean           isPass;



    private double           remainingAmount;

    //  private boolean ----> isPass;

    public Assistant(String name, int age, String account, String password, boolean isFree, double remainingAmount) {
        super(name, age, account, password);
        this.isFree = isFree; //AUTO ?
        this.remainingAmount = remainingAmount; //AUTO?
    }
    //X Y
    public Assistant(String name, int age, String account, String password, double longitude, double latitude, boolean isFree, double remainingAmount) {
        super(name, age, account, password, longitude, latitude);
        this.isFree = isFree;
        this.remainingAmount = remainingAmount;
    }

    public ArrayList<Order> getHistoryOrder(){
        return historyOrder;
    }

    public boolean getIsFree (){
        return isFree;
    }

    public double getRemainingAmount(){
        return remainingAmount;
    }

    public void setHistoryOrder(ArrayList<Order> historyOrder) {
        this.historyOrder = historyOrder;
    }

    public void setFree(Boolean flag){
        isFree=flag;
    }

    public void setRemainingAmount(double remainingAmount){
        this.remainingAmount=remainingAmount;
    }


    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }


    //=====================need others Class=========================
    public void confirmOrder(Customer customer){

    }

    public void completeOrder(Customer customer){

    }

    public void setOrderDescription(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input your Description:");

    }

    public void setOrderPrice(){

    }




}

