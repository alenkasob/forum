package com.frm.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by User on 23.11.2018.
 */



@Entity
@Table(name = "frm_groups")
public class GroupEntity implements Serializable {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "idx")
    private Integer idx;

    @Column(name = "is_public")
    private  Boolean isPublic ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }
}
/*
GRP	id	varchar 36	PK, uuid		GroupEntity	id	String
	name	varchar 128				name	String
	idx	INT				idx	Integer
	is_public	BIT				isPublic	Boolean
 */