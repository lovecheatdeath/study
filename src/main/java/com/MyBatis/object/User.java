package com.MyBatis.object;

public class User {
    private Long id;
    private Long createAt;
    private Long updateAt;
    private String name;
    private Long num;

    public Long getId(Long id) {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
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
    public String toString(){
        return"User{"+"id="+id+",createAt="+createAt+",updateAt="+updateAt+",name="+name+",num="+num+ '\''+'}';
    }
}
