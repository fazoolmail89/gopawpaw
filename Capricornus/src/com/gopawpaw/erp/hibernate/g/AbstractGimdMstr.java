package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGimdMstr entity provides the base persistence definition of the
 * GimdMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGimdMstr implements java.io.Serializable {

	// Fields

	private GimdMstrId id;
	private Integer gimdRefKey;
	private Date gimdModDate;
	private String gimdModUserid;
	private String gimdModelDesc;
	private String gimdUser1;
	private String gimdUser2;
	private String gimdQadc01;
	private String gimdQadc02;
	private Double oidGimdMstr;

	// Constructors

	/** default constructor */
	public AbstractGimdMstr() {
	}

	/** full constructor */
	public AbstractGimdMstr(GimdMstrId id, Integer gimdRefKey,
			Date gimdModDate, String gimdModUserid, String gimdModelDesc,
			String gimdUser1, String gimdUser2, String gimdQadc01,
			String gimdQadc02, Double oidGimdMstr) {
		this.id = id;
		this.gimdRefKey = gimdRefKey;
		this.gimdModDate = gimdModDate;
		this.gimdModUserid = gimdModUserid;
		this.gimdModelDesc = gimdModelDesc;
		this.gimdUser1 = gimdUser1;
		this.gimdUser2 = gimdUser2;
		this.gimdQadc01 = gimdQadc01;
		this.gimdQadc02 = gimdQadc02;
		this.oidGimdMstr = oidGimdMstr;
	}

	// Property accessors

	public GimdMstrId getId() {
		return this.id;
	}

	public void setId(GimdMstrId id) {
		this.id = id;
	}

	public Integer getGimdRefKey() {
		return this.gimdRefKey;
	}

	public void setGimdRefKey(Integer gimdRefKey) {
		this.gimdRefKey = gimdRefKey;
	}

	public Date getGimdModDate() {
		return this.gimdModDate;
	}

	public void setGimdModDate(Date gimdModDate) {
		this.gimdModDate = gimdModDate;
	}

	public String getGimdModUserid() {
		return this.gimdModUserid;
	}

	public void setGimdModUserid(String gimdModUserid) {
		this.gimdModUserid = gimdModUserid;
	}

	public String getGimdModelDesc() {
		return this.gimdModelDesc;
	}

	public void setGimdModelDesc(String gimdModelDesc) {
		this.gimdModelDesc = gimdModelDesc;
	}

	public String getGimdUser1() {
		return this.gimdUser1;
	}

	public void setGimdUser1(String gimdUser1) {
		this.gimdUser1 = gimdUser1;
	}

	public String getGimdUser2() {
		return this.gimdUser2;
	}

	public void setGimdUser2(String gimdUser2) {
		this.gimdUser2 = gimdUser2;
	}

	public String getGimdQadc01() {
		return this.gimdQadc01;
	}

	public void setGimdQadc01(String gimdQadc01) {
		this.gimdQadc01 = gimdQadc01;
	}

	public String getGimdQadc02() {
		return this.gimdQadc02;
	}

	public void setGimdQadc02(String gimdQadc02) {
		this.gimdQadc02 = gimdQadc02;
	}

	public Double getOidGimdMstr() {
		return this.oidGimdMstr;
	}

	public void setOidGimdMstr(Double oidGimdMstr) {
		this.oidGimdMstr = oidGimdMstr;
	}

}