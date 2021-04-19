package com.offcn.pojo;

import java.io.Serializable;

/**
 * @Auther: lhq
 * @Date: 2021/4/19 10:16
 * @Description:
 */
public class User implements Serializable {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
