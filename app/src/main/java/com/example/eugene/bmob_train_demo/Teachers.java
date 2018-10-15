package com.example.eugene.bmob_train_demo;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2018/10/1.
 */

public class Teachers extends BmobObject {
    private int id;
    private String name;
    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {

        return "name:" + name +
                " " +
                "address:" + address;
    }



}
