package DatabaseAccessObject;

import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DoSql {


    private UserMapper userMapper;


    public DoSql() throws IOException {

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        SqlSession sqlSession = sqlSessionFactory.openSession();


        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        this.userMapper = userMapper;
    }

    public String selectUserByAccount(String account){


        String s =  this.userMapper.selectPasswordByAccount(account);

        return s;
    }



}
