package com.lagou.sqlsession;

import com.lagou.config.XmlConfigBuilder;
import com.lagou.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * @author Treasure baby
 */
public class SqlSessionFactoryBuilder {

    public SqlSessionFactory build(InputStream in) throws DocumentException, PropertyVetoException {
        // 第一：使用dom4j解析配置文件，将解析出来的内容封装到Configuration中
        XmlConfigBuilder xmlConfigBuilder = new XmlConfigBuilder();
        Configuration configuration = xmlConfigBuilder.parseConfig(in);


        // 第二：创建sqlSessionFactory对象：工厂类：生产sqlSession:会话对象

        return new DefaultSqlSessionFactory(configuration);
    }


}
