package ObjectsAndLogic;


import java.util.ArrayList;
//code by Yiting Cao
public class OrderProcess {
    private ArrayList<Assistant> nearbyAssistant;
    private Customer currentCustomer;
    private Assistant currentAssistant;

    //订单处理
    public void orderProcess(Customer customer, ArrayList<Assistant> assistants){

    }

    //顾客产生订单
    public Order doProcess(Customer customer){

        return new Order("my order");
    }

    //生成order id
    public int  generateOrderId(Customer customer){

        return 0;
    }

    //创建优先级队列
    public void  createPriorityQueue(){

    }

    //寻找最近的专业人员
    public Assistant popNearest(){

        return new Assistant("name", 23,  "account",  "password",true,  20.4);
    }

    //计算顾客和专业人员的最近距离
    public double calculateEuclideanDistance(double lat1,double lat2,double lon1,double lon2){

        return 0;
    }

    //将订单添加进历史订单记录
    public void addHistoryOrder(Customer customer, Assistant assistant){

    }
}
