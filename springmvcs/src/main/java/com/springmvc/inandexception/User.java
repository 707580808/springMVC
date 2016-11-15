package com.springmvc.inandexception;

import com.springmvc.validator.Between;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * User
 * Author: zq
 * Date：2016/11/7
 */
public class User implements Serializable {
    @NotEmpty
    private String username;
    @NotEmpty
    @Pattern(regexp = "[0-9a-zA-Z]{6,30}",message = "密码是6-30个字符，必须是字母和数字的组合")
    private String password;
    private String qq;
    private String wx;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }
}
