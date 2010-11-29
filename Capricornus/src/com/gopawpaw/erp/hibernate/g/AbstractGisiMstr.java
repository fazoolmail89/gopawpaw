package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGisiMstr entity provides the base persistence definition of the
 * GisiMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGisiMstr implements java.io.Serializable {

	// Fields

	private GisiMstrId id;
	private Integer gisiRefKey;
	private Date gisiModDate;
	private String gisiModUserid;
	private String gisiUser1;
	private String gisiUser2;
	private String gisiQadc01;
	private String gisiQadc02;
	private Double oidGisiMstr;

	// Constructors

	/** default constructor */
	public AbstractGisiMstr() {
	}

	/** full constructor */
	public AbstractGisiMstr(GisiMstrId id, Integer gisiRefKey,
			Date gisiModDate, String gisiModUserid, String gisiUser1,
			String gisiUser2, String gisiQadc01, String gisiQadc02,
			Double oidGisiMstr) {
		this.id = id;
		this.gisiRefKey = gisiRefKey;
		this.gisiModDate = gisiModDate;
		this.gisiModUserid = gisiModUserid;
		this.gisiUser1 = gisiUser1;
		this.gisiUser2 = gisiUser2;
		this.gisiQadc01 = gisiQadc01;
		this.gisiQadc02 = gisiQadc02;
		this.oidGisiMstr = oidGisiMstr;
	}

	// Property accessors

	public GisiMstrId getId() {
		return this.id;
	}

	public void setId(GisiMstrId id) {
		this.id = id;
	}

	public Integer getGisiRefKey() {
		return this.gisiRefKey;
	}

	public void setGisiRefKey(Integer gisiRefKey) {
		this.gisiRefKey = gisiRefKey;
	}

	public Date getGisiModDate() {
		return this.gisiModDate;
	}

	public void setGisiModDate(Date gisiModDate) {
		this.gisiModDate = gisiModDate;
	}

	public String getGisiModUserid() {
		return this.gisiModUserid;
	}

	public void setGisiModUserid(String gisiModUserid) {
		this.gisiModUserid = gisiModUserid;
	}

	public String getGisiUser1() {
		return this.gisiUser1;
	}

	public void setGisiUser1(String gisiUser1) {
		this.gisiUser1 = gisiUser1;
	}

	public String getGisiUser2() {
		return this.gisiUser2;
	}

	public void setGisiUser2(String gisiUser2) {
		this.gisiUser2 = gisiUser2;
	}

	public String getGisiQadc01() {
		return this.gisiQadc01;
	}

	public void setGisiQadc01(String gisiQadc01) {
		this.gisiQadc01 = gisiQadc01;
	}

	public String getGisiQadc02() {
		return this.gisiQadc02;
	}

	public void setGisiQadc02(String gisiQadc02) {
		this.gisiQadc02 = gisiQadc02;
	}

	public Double getOidGisiMstr() {
		return this.oidGisiMstr;
	}

	public void setOidGisiMstr(Double oidGisiMstr) {
		this.oidGisiMstr = oidGisiMstr;
	}

}