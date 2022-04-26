package ObjectsAndLogic;

/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */
public class Admin extends User {

    private String as_account;

    public Admin(String name, int age, String account, String password, double longitude, double latitude) {
        super(name, age, account, password, longitude, latitude);
    }

    // new new new new new new new new new new new new new new new new new new new new new new new new new new
    public Admin(String account, String name, int age, String password, String as_account) {
        super(name, age, account, password);
        this.as_account = as_account;
    }
}
