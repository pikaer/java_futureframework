package com.pikaer.futureframework.dal.frameworkdb.dao;

import com.pikaer.futureframework.dal.frameworkdb.entity.MenuInfoEntity;

import java.util.List;

public interface IMenuInfoDao {
    List<MenuInfoEntity> getMenuList();
}
