package com.pikaer.futureframework.biz.impl;

import com.pikaer.futureframework.biz.IMenuBiz;
import com.pikaer.futureframework.entity.system.MenuInfo;
import com.pikaer.futureframework.entity.system.MenuResponse;
import com.pikaer.futureframework.entity.utils.ResponseCodeEnum;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuBiz implements IMenuBiz {
    @Override
    public MenuResponse getMenuList() {
        List<MenuInfo> menuList = new ArrayList<>();

        MenuInfo systemMenu = new MenuInfo(100, "系统管理", "", "fa fa-wrench");
        MenuInfo usersSubMenu = new MenuInfo(101, "用户管理", "users", "fa fa-user");
        MenuInfo rolesSubMenu = new MenuInfo(102, "角色管理", "roles", "fa fa fa-id-card");
        MenuInfo rightsSubMenu = new MenuInfo(103, "权限管理", "rights", "fa fa-cog");
        systemMenu.setSubMenuList(Lists.newArrayList(usersSubMenu, rolesSubMenu, rightsSubMenu));

        menuList.add(systemMenu);

        MenuResponse response = new MenuResponse();
        response.setCodeAndMsg(ResponseCodeEnum.SUCCESS.getCode(), ResponseCodeEnum.SUCCESS.getMsg());
        response.setMenuList(menuList);
        return response;
    }
}
