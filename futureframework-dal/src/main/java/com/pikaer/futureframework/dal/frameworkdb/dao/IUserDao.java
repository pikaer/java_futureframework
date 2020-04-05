package com.pikaer.futureframework.dal.frameworkdb.dao;

import com.pikaer.futureframework.dal.frameworkdb.entity.UserInfoEntity;

public interface IUserDao {
    UserInfoEntity selectUserById();
}
