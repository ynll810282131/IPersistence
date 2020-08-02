package com.lagou.sqlsession;

import java.util.List;

/**
 * @author Treasure baby
 */
public interface SqlSession {

    /**
     * 查询所有
     *
     * @param statementId
     * @param params
     * @param <E>
     * @return
     * @throws Exception
     */
    <E> List<E> selectList(String statementId, Object... params) throws Exception;

    /**
     * 根据条件查询单个
     *
     * @param statementId
     * @param params
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T selectOne(String statementId, Object... params) throws Exception;

    /**
     * 为Dao接口生成代理实现类
     *
     * @param mapperClass
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<?> mapperClass);
}
