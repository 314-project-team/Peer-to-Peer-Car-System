package ObjectsAndLogic;

import java.io.IOException;

/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Car {

    private String Rego;
    private String Color;
    private String Brand;
    private CarStatus Status;
    private String Describe;
    private String Account;

    public Car(String Rego, String Color, String Brand) {
        this.Rego = Rego;
        this.Color = Color;
        this.Brand = Brand;
    }

    public Car(String Rego, String Color, String Brand, String describe, String status,String Account) throws IOException {
        this.Rego = Rego;
        this.Color = Color;
        this.Brand = Brand;
        this.Status = CarStatus.Fine;
        this.Describe = describe;
        this.Account = Account;

        MyBatisDemo myBatisDemo = new MyBatisDemo();
        myBatisDemo.addCar("", "asd", "df", "fgh", "vbn", "11111");

    }

    public String getRego() {
        return Rego;
    }

    public void setRego(String rego) {
        this.Rego = rego;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public CarStatus getStatus() {
        return Status;
    }

    public void setStatus(CarStatus status) {
        this.Status = status;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        this.Describe = describe;
    }


}







