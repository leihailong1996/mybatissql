package com.ouyeel.pojo;

import java.util.Date;

public class FileHistory {
    private int id;
    private Date created_date;
    private String absolute_path;
    private String name;
    private String path;
    private String is_exists;
    private String module_ename;

    @Override
    public String toString() {
        return "FileHistory{" +
                "id=" + id +
                ", created_date=" + created_date +
                ", absolute_path='" + absolute_path + '\'' +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", is_exists='" + is_exists + '\'' +
                ", module_ename='" + module_ename + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public String getAbsolute_path() {
        return absolute_path;
    }

    public void setAbsolute_path(String absolute_path) {
        this.absolute_path = absolute_path;
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

    public String getIs_exists() {
        return is_exists;
    }

    public void setIs_exists(String is_exists) {
        this.is_exists = is_exists;
    }

    public String getModule_ename() {
        return module_ename;
    }

    public void setModule_ename(String module_ename) {
        this.module_ename = module_ename;
    }
}
