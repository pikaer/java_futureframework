package com.pikaer.futureframework.web.action;

import com.pikaer.futureframework.biz.IMenuBiz;
import com.pikaer.futureframework.entity.system.MenuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/menu")
public class MenuAction {

    @Autowired
    private IMenuBiz menuBiz;

    /**
     * desc : 获取菜单list
     * create_user : cheng
     * create_date : 2020/3/11 19:12
     */
    @RequestMapping(value = "/getMenuList")
    public MenuResponse getMenuList() {
        return menuBiz.getMenuList();
    }

}