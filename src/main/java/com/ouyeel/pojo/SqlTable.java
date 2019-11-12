package com.ouyeel.pojo;

import java.util.Date;

public class SqlTable {
    private int id;
    private Date  create_Date ;
    private Date  last_modified_Date    ;
    private String   module_ename;
    private String   sql;
    private String   path;
    private String   name;
    private int   changeNum;
    private char   flag;
    private String   fileName;
    private String   svnVersion;
    private String   svnLastModifiedPerson;
    private String   sqlMethod;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreate_Date() {
        return create_Date;
    }

    public void setCreate_Date(Date create_Date) {
        this.create_Date = create_Date;
    }

    public Date getLast_modified_Date() {
        return last_modified_Date;
    }

    public void setLast_modified_Date(Date last_modified_Date) {
        this.last_modified_Date = last_modified_Date;
    }

    public String getModule_ename() {
        return module_ename;
    }

    public void setModule_ename(String module_ename) {
        this.module_ename = module_ename;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(int changeNum) {
        this.changeNum = changeNum;
    }

    public char getFlag() {
        return flag;
    }

    public void setFlag(char flag) {
        this.flag = flag;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSvnVersion() {
        return svnVersion;
    }

    public void setSvnVersion(String svnVersion) {
        this.svnVersion = svnVersion;
    }

    public String getSvnLastModifiedPerson() {
        return svnLastModifiedPerson;
    }

    public void setSvnLastModifiedPerson(String svnLastModifiedPerson) {
        this.svnLastModifiedPerson = svnLastModifiedPerson;
    }

    public String getSqlMethod() {
        return sqlMethod;
    }

    public void setSqlMethod(String sqlMethod) {
        this.sqlMethod = sqlMethod;
    }

    @Override
    public String toString() {
        return "SqlTable{" +
                "id=" + id +
                ", create_Date=" + create_Date +
                ", last_modified_Date=" + last_modified_Date +
                ", module_ename='" + module_ename + '\'' +
                ", sql='" + sql + '\'' +
                ", path='" + path + '\'' +
                ", name='" + name + '\'' +
                ", changeNum=" + changeNum +
                ", flag=" + flag +
                ", fileName='" + fileName + '\'' +
                ", svnVersion='" + svnVersion + '\'' +
                ", svnLastModifiedPerson='" + svnLastModifiedPerson + '\'' +
                ", sqlMethod='" + sqlMethod + '\'' +
                '}';
    }
}
