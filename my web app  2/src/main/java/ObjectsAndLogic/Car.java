package ObjectsAndLogic;

/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Car {

    private String rego;
    private String color;
    private String brand;
    private String status;
    private String describe;
    private String account;

    public Car(String rego, String color, String brand, String describe, String status,String account) {
        this.rego = rego;
        this.color = color;
        this.brand = brand;
        this.status=status;
        this.describe = describe;
        this.account = account;

    }


    public Car(Car car) {
        this.rego = car.rego;
        this.color= car.color;
        this.brand= car.brand;
        this.status=car.status;
        this.describe=car.describe;
        this.account = car.account;
    }

    public String getRego() {
        return rego;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setRego(String rego) {
        this.rego = rego;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


}







