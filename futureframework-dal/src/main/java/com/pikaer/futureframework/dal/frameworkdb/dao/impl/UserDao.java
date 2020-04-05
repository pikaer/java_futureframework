package com.pikaer.futureframework.dal.frameworkdb.dao.impl;

import com.pikaer.futureframework.dal.frameworkdb.dao.IUserDao;
import com.pikaer.futureframework.dal.frameworkdb.dao.SqlSessionFactoryUtil;
import com.pikaer.futureframework.dal.frameworkdb.entity.UserInfoEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao {
    @Override
    public UserInfoEntity selectUserById(){
        try(SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession(true)){
            UserInfoEntity user = null;
            //打开一个会话
            //查询单个对象
            user = sqlSession.selectOne("com.pikaer.futureframework.dal.mapper.userMapper.getUserInfoByUid");
            //关闭会话
            SqlSessionFactoryUtil.closeSession(sqlSession);
            return user;
        }catch (Exception ex){
            return null;
        }
    }

}
