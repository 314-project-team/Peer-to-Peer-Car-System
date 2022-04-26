package mapper;

import ObjectsAndLogic.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<Assistant> selectPassAssistant();

    List<Assistant> selectIdleAssistant();

    void addCustomer(@Param("account") String account, @Param("name") String name, @Param("age") int age, @Param("password") String password, @Param("isMember") boolean isMember, @Param("longitude") double longitude, @Param("latitude") double latitude, @Param("balance") int balance);

    void addCar(@Param("rego") String rego, @Param("color") String color, @Param("brand") String brand, @Param("describe") String describe, @Param("status") String status, @Param("account") String account);

    void addAssistant(@Param("account") String account, @Param("name") String name, @Param("age") int age, @Param("password") String password, @Param("isPass") boolean isPass, @Param("isFree") boolean isFree, @Param("longitude") double longitude, @Param("latitude") double latitude, @Param("balance") double balance);

    void addAdmin(@Param("account") String account, @Param("name") String name, @Param("age") int age, @Param("password") String password, @Param("as_account") String as_account);

    void addOrders(@Param("orderID") String orderID, @Param("describe") String describe, @Param("price") double price, @Param("cu_account") String cu_account, @Param("as_account") String as_account);

    int updateAssistantBalance(double Balance, String AS_Account);

    int updateCustomerBalance(double Balance, String CU_Account);

    int updateAssistantPassCondition(String AS_Account);

    void deleteAssistant(String AS_Account);

    void deleteAdmin(String Ad_Account);

    List<Orders> selectOrders();
}
