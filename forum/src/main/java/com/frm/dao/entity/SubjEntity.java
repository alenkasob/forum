package com.frm.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "frm_subj")
public class SubjEntity  implements Serializable {

    @Id
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name= "user_id")
    private String user_id;

    @Column(name = "dt_create")
    private Timestamp dt_create;

    @Column(name = "is_open")
    private Boolean is_open;

    @Column(name = "cnt_msg")
    private Integer cnt_msg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Boolean getIs_open() {
        return is_open;
    }

    public void setIs_open(Boolean is_open) {
        this.is_open = is_open;
    }

    public Integer getCnt_msg() {
        return cnt_msg;
    }

    public void setCnt_msg(Integer cnt_msg) {
        this.cnt_msg = cnt_msg;
    }
}

    /*

    SUBJ	id	varchar 36	PK, uuid		SubjectEntity	id	String
	title	varchar 128				title	String
	user_id	varchar 36				user_id	String
	dt_create	TIMESTAMP				dt_create	Timestamp
	is_open	BIT				is_open	Boolean
	cnt_msg	INT				cnt_msg	Integer
    */

