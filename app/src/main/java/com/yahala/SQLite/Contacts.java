package com.yahala.SQLite;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

/**
 * Entity mapped to table CONTACTS.
 */
public class Contacts {

    private Long id;
    private String jid;
    private String fname;
    private String sname;
    private String avatar;

    public Contacts() {
    }

    public Contacts(Long id) {
        this.id = id;
    }

    public Contacts(Long id, String jid, String fname, String sname, String avatar) {
        this.id = id;
        this.jid = jid;
        this.fname = fname;
        this.sname = sname;
        this.avatar = avatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
