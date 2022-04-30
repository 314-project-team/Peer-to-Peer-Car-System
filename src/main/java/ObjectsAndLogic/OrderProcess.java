package ObjectsAndLogic;


import java.util.ArrayList;
import java.util.Comparator;

import static java.lang.Math.sqrt;

//code by Yiting Cao
public class OrderProcess {

    private ArrayList<Assistant> nearbyAssistant;
    private Customer currentCustomer;
    private Assistant currentAssistant;
    private Orders currentOrder;

    //创建OrderProcess对象后，调用数据库Assistant表中的数据

    //订单处理(构造函数)
    public OrderProcess(Customer customer, ArrayList<Assistant> assistants){
        //构造ArrayList<Assistant> assistant之后改成select * from assistant
        //orderprocess存入数据库
        //将传入参数保存
        nearbyAssistant = assistants;
        currentCustomer= customer;

        createPriorityQueue();//距离排序
        popNearest();         //找出最近的assistant并赋予currentAssistant
        doProcess();          //生产完整的订单
        addHistoryOrder();    //订单完成，加入到历史订单中
    }





    //创建优先级队列
    public void  createPriorityQueue(){


        //计算每个assistant与customer的距离
        for (int i = 0;i<nearbyAssistant.size();i++){
            //遍历每一个assistant，通过calculateEuclideanDistance方法计算最近距离
            currentAssistant = nearbyAssistant.get(i);
            currentAssistant.setDistanceToCustomer(calculateEuclideanDistance(currentCustomer.getLatitude(),currentAssistant.getLatitude(),currentCustomer.getLongitude(),currentAssistant.getLongitude())) ;
        }

        //排序assistant，最大的放最后，最小放最前，每次取得时候pop最前面的
        nearbyAssistant.sort(new SortByDistance());

        //取最小距离，现不需要
//        double shortestDistance = 999999;
//        double currentDistance = 0;
//        for (int i = 0;i<nearbyAssistant.size();i++){
//            //遍历每一个assistant，通过calculateEuclideanDistance方法计算最近距离
//            currentAssistant = nearbyAssistant.get(i);
//         currentDistance = calculateEuclideanDistance(currentCustomer.getLatitude(),currentAssistant.getLatitude(),currentCustomer.getLongitude(),currentAssistant.getLongitude());
//        //如果当前距离小于最小距离，则最小距离被当前距离替换
//        if(currentDistance < shortestDistance){
//            shortestDistance = currentDistance;
//            }
//        }

    }




    //寻找最近的专业人员并呼叫
    public Assistant popNearest(){
        //对遍历好的专业人员集合进行遍历，首先先判断专业人员是否空闲,对首个专业人员进行询问是否接受，如果拒绝则遍历到下一个专业人员进行询问，如果接受则break结束遍历，并将该专业人员isIdle改为false,
        for (int i = 0;i<nearbyAssistant.size();i++){
            if(currentAssistant.getIsFree()==true){
                if(currentAssistant.confirmOrder(currentCustomer)==true){
                    currentAssistant.setFree(false);
                    //数据库修改状态
                    break;
                }
            }
        }

        return new Assistant(currentAssistant.getName(),currentAssistant.getAge(),currentAssistant.getAccount(),currentAssistant.getPassword(),currentAssistant.getIsFree(),currentAssistant.getBalance());
    }


    //计算顾客和专业人员的最近距离
    public double calculateEuclideanDistance(double lat1,double lat2,double lon1,double lon2){
        //计算欧几里得距离
        return sqrt(Math.pow(lat2-lat1,2) + Math.pow(lon2-lon1,2));
    }



    //产生订单(产生完整的订单)
    public Orders doProcess(){

        currentOrder = currentCustomer.orderService();//拿到只有Customer部分信息的订单
        //完成订单的参数 Assistant需要填写的三个参数
        currentOrder.setAssistantAccount(currentAssistant.getAccount());
        currentOrder.setPrice(currentAssistant.setOrderPrice());
        String  des=currentAssistant.setOrderDescription(currentCustomer);
        currentOrder.setDescribe(des);


        if((currentCustomer.getBalance()-currentOrder.getPrice())<0){
            //余额不足，扣款会扣成负数
            //余额负数不能再发起订单
        }else{
            currentCustomer.setBalance(currentCustomer.getBalance()-currentOrder.getPrice());
            currentAssistant.setBalance(currentCustomer.getBalance()+currentOrder.getPrice());
        }


        currentAssistant.setFree(true);
        //数据库修改状态
        return currentOrder;
    }



    //将订单添加进历史订单记录
    public void addHistoryOrder(){
        currentCustomer.addHistoryOrder(currentOrder);
        currentAssistant.addHistoryOrder(currentOrder);

    }

    public Assistant getCurrentAssistant() {
        return currentAssistant;
    }

    public void setCurrentAssistant(Assistant currentAssistant) {
        this.currentAssistant = currentAssistant;
    }
}

//assistant类里需要新建一个变量distanceToCustomer来记录和customer的距离
class SortByDistance implements Comparator {

    //返回距离
    public int compare(Object o1, Object o2) {
        Assistant a1 = (Assistant) o1;
        Assistant a2 = (Assistant) o2;
        //第一种返回方法

        Double d1 = a1.getDistanceToCustomer();
        Double d2 = a2.getDistanceToCustomer();

        //d1小于d2返回-1，等于返回0，大于返回1
        int result = d1.compareTo(d2);
        return result;



        //第二种返回方法
//          if (a1.getDistanceToCustomer() > a1.getDistanceToCustomer()){
//              return 1;
//          }else{
//              return -1;
//          }

    }
}