package com.imooc.o2o.entity;

import java.util.Date;

public class WechatAuth {
    private Long wechateAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;

    public Long getWechateAuthId() {
        return wechateAuthId;
    }

    public void setWechateAuthId(Long wechateAuthId) {
        this.wechateAuthId = wechateAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}

