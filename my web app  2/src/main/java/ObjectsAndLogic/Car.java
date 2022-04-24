package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Car {

    private String    rego;
    private String    color;
    private String    brand;
    private CarStatus status;

    private String  describe;

    public Car(String rego, String color,String  brand) {
        this.rego = rego;
        this.color= color;
        this.brand=brand;
        this.status=CarStatus.Fine;
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

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}







