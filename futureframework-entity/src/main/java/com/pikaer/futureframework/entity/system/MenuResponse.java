package com.pikaer.futureframework.entity.system;

import com.pikaer.futureframework.entity.utils.BaseResponse;

import java.util.List;

public class MenuResponse extends BaseResponse {
    private List<MenuInfo>menuList;

    public List<MenuInfo> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuInfo> menuList) {
        this.menuList = menuList;
    }
}
