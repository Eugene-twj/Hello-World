package com.example.eugene.bmob_train_demo;

import cn.bmob.v3.BmobUser;

/**
 * Created by Administrator on 2018/9/29.
 */

public class Users extends BmobUser {
    private boolean sex;
    private String nick;
    private Integer age;


    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
