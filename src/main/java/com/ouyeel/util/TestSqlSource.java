package com.ouyeel.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

public class TestSqlSource {
    public static void main(String[] args) throws  Exception{
        String resource = "d:\\abc.xml";
        InputStream inputStream = Resources.getResourceAsStream("d:\\abc.xml");
        InputStream inputStream1 = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                .build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try {
            Configuration configuration = session.getConfiguration();
            MappedStatement mappedStatement = configuration
                    .getMappedStatement("mybatis.UserDao.find2");
            assertNotNull(mappedStatement);


            BoundSql boundSql = mappedStatement.getBoundSql(null);
            String sql = boundSql.getSql();

            Map<String, Object> map = new HashMap<String, Object>();
            map.put("userName", "admin");
            map.put("userPassword", "admin");
            BoundSql boundSql2 = mappedStatement.getBoundSql(map);
            String sql2 = boundSql2.getSql();


        } finally {
            session.close();
        }

    }
}
