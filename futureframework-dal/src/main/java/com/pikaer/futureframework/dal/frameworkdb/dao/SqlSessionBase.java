package com.pikaer.futureframework.dal.frameworkdb.dao;


import com.fasterxml.jackson.core.type.TypeReference;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public abstract class SqlSessionBase<T> {

    protected abstract TypeReference<T> getTypeReference();

    private SqlSessionFactory getFactory(){
        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        try{
            inputStream =getTypeReference().getClass().getClassLoader().getResourceAsStream("frameworkdbconfig.xml");
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

    public SqlSession openSqlSession(boolean isAutoCommit){
        return getFactory().openSession(isAutoCommit);
    }

    public void closeSession(SqlSession sqlSession){
        if(sqlSession!=null){
            sqlSession.close();
        }
    }
}
