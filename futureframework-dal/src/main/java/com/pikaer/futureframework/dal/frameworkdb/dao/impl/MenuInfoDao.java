package com.pikaer.futureframework.dal.frameworkdb.dao.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.pikaer.futureframework.dal.config.DalConst;
import com.pikaer.futureframework.dal.config.MapperConst;
import com.pikaer.futureframework.dal.frameworkdb.dao.IMenuInfoDao;
import com.pikaer.futureframework.dal.frameworkdb.dao.SqlSessionBase;
import com.pikaer.futureframework.dal.frameworkdb.entity.MenuInfoEntity;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuInfoDao extends SqlSessionBase<MenuInfoDao> implements IMenuInfoDao {
    @Override
    protected TypeReference<MenuInfoDao> getTypeReference() {
        return new TypeReference<>() {};
    }

    @Override
    protected String getDbName() {
        return DalConst.FRAMEWORKDB;
    }

    @Override
    public String getMapperNameSpace() {
        return MapperConst.MenuInfoMapper;
    }

    @Override
    public List<MenuInfoEntity> getMenuList() {
        SqlSession sqlSession = openSqlSession(true);
        List<MenuInfoEntity> menuList=sqlSession.selectList(getMapperName("selectMenuList"));
        closeSession(sqlSession);
        return menuList;
    }
}
