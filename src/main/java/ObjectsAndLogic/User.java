package ObjectsAndLogic;
/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */


abstract public class  User {

    private  String name;
    private  int    age;
    private  String account;
    private  String password;

    private  double longitude;
    private  double latitude;



    //Two constructor design.
    public User(String name, int age, String account, String password) {
        this.name = name;
        this.age = age;
        this.account = account;
        this.password = password;
        //Auto generate longitude and latitude?

    }


    public User(String name, int age, String account, String password, double longitude, double latitude) {
        this.name = name;
        this.age = age;
        this.account = account;
        this.password = password;
        this.longitude = longitude;
        this.latitude = latitude;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }





}
