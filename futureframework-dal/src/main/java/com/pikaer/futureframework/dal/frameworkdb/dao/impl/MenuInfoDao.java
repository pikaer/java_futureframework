package com.pikaer.futureframework.dal.frameworkdb.dao.impl;

import com.pikaer.futureframework.dal.frameworkdb.dao.IMenuInfoDao;
import org.springframework.stereotype.Repository;

@Repository
public class MenuInfoDao implements IMenuInfoDao {
    @Override
    public int count() {
        return 6;
    }
}
