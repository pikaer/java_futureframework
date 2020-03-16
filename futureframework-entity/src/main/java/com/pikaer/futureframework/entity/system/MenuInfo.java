package com.pikaer.futureframework.entity.system;

import java.util.List;

/**
 * 菜单信息
 */
public class MenuInfo {
    private int id;

    private String name;

    private String path;

    private String icon;

    private List<MenuInfo> subMenuList;

    public MenuInfo(int id, String name, String path, String icon) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<MenuInfo> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<MenuInfo> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
