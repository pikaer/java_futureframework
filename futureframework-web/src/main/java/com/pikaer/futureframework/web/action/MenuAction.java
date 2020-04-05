package com.pikaer.futureframework.web.action;

import com.pikaer.futureframework.biz.IMenuBiz;
import com.pikaer.futureframework.dal.frameworkdb.dao.impl.UserDao;
import com.pikaer.futureframework.dal.frameworkdb.entity.UserInfoEntity;
import com.pikaer.futureframework.entity.system.MenuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/menu")
public class MenuAction {

    @Autowired
    private IMenuBiz menuBiz;

    @RequestMapping(value = "/getMenuList")
    public MenuResponse getMenuList() {
        UserInfoEntity user = new UserDao().selectUserById();
        return menuBiz.getMenuList();
    }

}