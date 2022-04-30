package ObjectsAndLogic;

/*
 *  NAME: Yanchao Yu
 *  Task: Car, Order, Wallet
 *
 */
public class Car {
    private String rego;
    private String color;
    private String brand;
    private String describe;
    private String status;

    public Car(String rego,String color,String brand,String describe,String status){
        this.rego = rego;
        this.color = color;
        this.brand = brand;
        this.describe = describe;
        this.status = status;
    }

    public String getRego() {
        return rego;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "Car{"+
                "rego: " + rego +
                ",color: " + color + '\''+
                ",brand: " + brand + '\''+
                ",describe: " + describe + '\''+
                ",status: " + status + '\''+
                '}';
    }
}
