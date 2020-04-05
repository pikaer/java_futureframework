package com.pikaer.futureframework.dal.frameworkdb.dao;


import com.pikaer.futureframework.dal.config.DalConst;
import com.pikaer.futureframework.dal.frameworkdb.dao.impl.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
    /**
     *@Author 小江  [com.zhbit]
     *@Date 2019/2/6 22:38
     *Description
     */
    public static SqlSessionFactory getFactory(){
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        try{
            inputStream = UserDao.class.getClassLoader().getResourceAsStream("mybatis-cfg.xml");
            //根据配置的输入流构造一个SQL会话工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }finally{
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return sqlSessionFactory;
    }
    /**
     *@Author 小江  [com.zhbit]
     *@Date 2019/2/6 22:41
     *Description   获得sql会话，是否自动提交
     */
    public static SqlSession openSqlSession(boolean isAutoCommit){
        return getFactory().openSession(isAutoCommit);
    }
    /**
     *@Author 小江  [com.zhbit]
     *@Date 2019/2/6 22:42
     *Description   关闭会话
     */
    public static void closeSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}