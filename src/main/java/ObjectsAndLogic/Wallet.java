package ObjectsAndLogic;
/*
 *  NAME: Yanchao Yu
 *  Task: Car, Order, Wallet
 *
 */
public class Wallet {

    //顾客充值
    public static void recharge(Customer c ,double rechargeMoney){
        double currentBalance = c.getBalance() + rechargeMoney;
        if (currentBalance  < 0){
            System.out.println("Balance less than 0");
        }else{
            System.out.println("Balance after recharge:" + currentBalance);
        }
    }

    //助手充值
    public static void recharge(Assistant a ,double rechargeMoney){
        double currentBalance = a.getBalance() + rechargeMoney;
        if (currentBalance  < 0){
            System.out.println("Balance less than 0");
        }else{
            System.out.println("Balance after recharge:" + currentBalance);
        }
    }

    //顾客消费
    public static void spend(Customer c ,double spendMoney){
        double currentBalance = c.getBalance() - spendMoney;
        if (currentBalance  < 0){
            System.out.println("Balance not enough");
        }else{
            System.out.println("Balance after spend:" + currentBalance);
        }
    }

    //助手消费
    public static void spend(Assistant a ,double spendMoney){
        double currentBalance = a.getBalance() - spendMoney;
        if (currentBalance  < 0){
            System.out.println("Balance not enough");
        }else{
            System.out.println("Balance after spend:" + currentBalance);
        }

    }
}
