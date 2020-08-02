package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

/**
 * @author Treasure baby
 */
public interface UserDao {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAll();


    /**
     * 根据条件进行用户查询
     *
     * @param user
     * @return
     */
    User findByCondition(User user);

    /**
     * 插入
     *
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 更新
     *
     * @param updateUser
     * @return
     */
    int update(User updateUser);

    /**
     * 删除
     *
     * @param deleteUser
     * @return
     */
    int delete(User deleteUser);
}
