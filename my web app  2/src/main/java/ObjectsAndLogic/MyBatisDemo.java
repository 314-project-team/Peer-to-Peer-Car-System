package ObjectsAndLogic;


import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisDemo {

    public static void main(String[] args) throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //获取sql session 对象，执行sql

        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行sql

        //List<User> users = sqlSession.selectList("test.selectAll");
        //获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        System.out.println(users+"\n");


        User u =  userMapper.selectById(1);
        System.out.println(u);

        sqlSession.close();

    }
}
