package com.frm.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "frm_msgs")
public class MsgEntity implements Serializable {

    @Id
    private String id;

    @Column(name = "idx")
    private Integer idx;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "dt_create")
    private Timestamp dt_create;

    @Column(name = "message")
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Timestamp getDt_create() {
        return dt_create;
    }

    public void setDt_create(Timestamp dt_create) {
        this.dt_create = dt_create;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

/*
MSG	id	varchar 36	PK, uuid		MesageEntity	id	String
	idx	INT				idx	Integer
	user_id	varchar 36				user_id	String
	dt_create	TIMESTAMP				dt_create	Timestamp
	message	CLOB				message	String
* */