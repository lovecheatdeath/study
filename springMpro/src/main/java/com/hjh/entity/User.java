package com.hjh.entity;

public class User {
    private Long id;
    private Long createtime;
    private Long updatetime;
    private String name;
    private Long num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", createAt=" + createtime +
                ", updateAt=" + updatetime +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}