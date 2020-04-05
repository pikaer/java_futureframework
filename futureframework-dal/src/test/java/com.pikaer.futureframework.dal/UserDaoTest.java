package com.pikaer.futureframework.dal;

import com.pikaer.futureframework.dal.frameworkdb.dao.impl.UserDao;
import com.pikaer.futureframework.dal.frameworkdb.entity.UserInfoEntity;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    UserDao userDao;

    @Test
    public void selectUserById() throws Exception{
        UserInfoEntity user = new UserDao().selectUserById();
        System.out.println(user);
    }
}
