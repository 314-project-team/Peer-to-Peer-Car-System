package mapper;

import ObjectsAndLogic.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectById(int id);

    String selectPasswordByAccount(String account);

}
