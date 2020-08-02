package com.lagou.sqlsession;

import com.lagou.pojo.Configuration;
import com.lagou.pojo.MappedStatement;

import java.util.List;

/**
 * @author Treasure baby
 */
public interface Executor {

    <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
