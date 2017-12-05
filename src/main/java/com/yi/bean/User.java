package com.yi.bean;

public class User {
    private Integer userid;

    private String username;

    private String password;

    private String salt;

    private String regtime;

    private String lastsigntime;

    private Integer signstate;

    private Integer tickeid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime == null ? null : regtime.trim();
    }

    public String getLastsigntime() {
        return lastsigntime;
    }

    public void setLastsigntime(String lastsigntime) {
        this.lastsigntime = lastsigntime == null ? null : lastsigntime.trim();
    }

    public Integer getSignstate() {
        return signstate;
    }

    public void setSignstate(Integer signstate) {
        this.signstate = signstate;
    }

    public Integer getTickeid() {
        return tickeid;
    }

    public void setTickeid(Integer tickeid) {
        this.tickeid = tickeid;
    }
}