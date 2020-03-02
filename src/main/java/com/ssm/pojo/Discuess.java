package com.ssm.pojo;

import java.util.Date;

/**
 * Author：ViRGiL
 * Date：2020/3/2
 * 用作留言板POJO
 */

public class Discuess {
    private String msg;
    private Date date;

    public Discuess() {
    }

    public Discuess(String msg, Date date) {
        this.msg = msg;
        this.date = date;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
