package com.lagou.test;

import com.alibaba.fastjson.JSON;
import com.lagou.dao.UserDao;
import com.lagou.io.Resources;
import com.lagou.pojo.User;
import com.lagou.sqlsession.SqlSession;
import com.lagou.sqlsession.SqlSessionFactory;
import com.lagou.sqlsession.SqlSessionFactoryBuilder;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.DocumentException;
import org.junit.Before;
import org.junit.Test;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Treasure baby
 */
@Slf4j
public class IPersistenceTest {

    private UserDao userDao;

    @Before
    public void getMapper() throws PropertyVetoException, DocumentException {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);
    }

    @Test
    public void findAllTest() {
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            log.info("user:{}", JSON.toJSONString(user));
        }
    }

    @Test
    public void insertTest() {
        User user = new User();
        user.setId(9);
        user.setUsername("Luck");
        int result = userDao.insert(user);
        log.info("result:{}", result);
    }

    @Test
    public void update() {
        User updateUser = new User();
        updateUser.setId(9);
        updateUser.setUsername("Tony");
        int result = userDao.update(updateUser);
        log.info("result:{}", result);
    }

    @Test
    public void deleteTest() {
        User deleteUser = new User();
        deleteUser.setId(9);
        deleteUser.setUsername("Tony");
        int result = userDao.delete(deleteUser);
        log.info("result:{}", result);
    }
}
