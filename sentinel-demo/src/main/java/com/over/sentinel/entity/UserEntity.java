package com.over.sentinel.entity;

/**
 * Created by jsflz on 2022/5/19 16:18
 */

public class UserEntity {
    public UserEntity(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
