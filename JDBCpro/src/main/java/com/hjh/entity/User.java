package com.hjh.entity;

public class User {
    private Long Id;
    private Long createAt;
    private Long updateAt;
    private String name;
    private Long num;

//public User(Long id, Long createAt, Long updateAt, String name){
//    this.id=id;this.createAt=createAt;this.updateAt=updateAt;this.name=name;
//}
public Long getId(){
    return Id;
}
public void setId(Long Id){
    this.Id=Id;
}
public Long getCreateAt(){
    return createAt;
}
public void setCreateAt(Long createAt){
    this.createAt=createAt;
}
public Long getUpdateAt(){return updateAt; }
public  void setUpdateAt(Long updateAt){
    this.updateAt=updateAt;
}
public String getName() {
        return name;
    }
public void setName(String name) {
        this.name = name;
    }
public Long getNum(){return num;}
public void setNum(Long num){this.num=num;}
    //toString 方法来自于Object 类，作用是：
    //返回一个字符串，是该Java对象的内存地址经过哈希算法得出的int类型的值在转换成十六进制。

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}

