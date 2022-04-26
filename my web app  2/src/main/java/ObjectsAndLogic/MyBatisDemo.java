package ObjectsAndLogic;


import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {

    public static void main(String[] args) throws IOException {
        addCar("3","2","2","2","2","11111");

    }

    @Test
    public static void selectIdleAssistant() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sql session 对象，执行sql

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行sql

        //List<User> users = sqlSession.selectList("test.selectAll");
        //获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Assistant> Assistant = userMapper.selectIdleAssistant();

        System.out.println(Assistant);

        sqlSession.close();
    }

    @Test
    public static void addCar(String rego, String color, String brand, String describe, String status,String account) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sql session 对象，执行sql

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行sql

        //List<User> users = sqlSession.selectList("test.selectAll");
        //获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.addCar(rego,color,brand,describe, status, account);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public static void addCar() throws IOException {

        String AD_Account = "99991";

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sql session 对象，执行sql

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行sql

        //List<User> users = sqlSession.selectList("test.selectAll");
        //获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.deleteAdmin(AD_Account);

        sqlSession.commit();
        sqlSession.close();
    }

}



//    @Test
//    public static void addCar(Car car) throws IOException {
//
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        //获取sql session 对象，执行sql
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        //执行sql
//
//        //List<User> users = sqlSession.selectList("test.selectAll");
//        //获取代理对象
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//
//        userMapper.addCar(car);
//
//        sqlSession.commit();
//        sqlSession.close();
//    }