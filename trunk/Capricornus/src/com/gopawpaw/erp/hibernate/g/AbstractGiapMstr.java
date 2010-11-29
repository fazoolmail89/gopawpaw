package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGiapMstr entity provides the base persistence definition of the
 * GiapMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGiapMstr implements java.io.Serializable {

	// Fields

	private GiapMstrId id;
	private String giapAppDesc;
	private Integer giapRefKey;
	private Date giapModDate;
	private String giapModUserid;
	private String giapUser1;
	private String giapUser2;
	private String giapQadc01;
	private String giapQadc02;
	private Double oidGiapMstr;

	// Constructors

	/** default constructor */
	public AbstractGiapMstr() {
	}

	/** full constructor */
	public AbstractGiapMstr(GiapMstrId id, String giapAppDesc,
			Integer giapRefKey, Date giapModDate, String giapModUserid,
			String giapUser1, String giapUser2, String giapQadc01,
			String giapQadc02, Double oidGiapMstr) {
		this.id = id;
		this.giapAppDesc = giapAppDesc;
		this.giapRefKey = giapRefKey;
		this.giapModDate = giapModDate;
		this.giapModUserid = giapModUserid;
		this.giapUser1 = giapUser1;
		this.giapUser2 = giapUser2;
		this.giapQadc01 = giapQadc01;
		this.giapQadc02 = giapQadc02;
		this.oidGiapMstr = oidGiapMstr;
	}

	// Property accessors

	public GiapMstrId getId() {
		return this.id;
	}

	public void setId(GiapMstrId id) {
		this.id = id;
	}

	public String getGiapAppDesc() {
		return this.giapAppDesc;
	}

	public void setGiapAppDesc(String giapAppDesc) {
		this.giapAppDesc = giapAppDesc;
	}

	public Integer getGiapRefKey() {
		return this.giapRefKey;
	}

	public void setGiapRefKey(Integer giapRefKey) {
		this.giapRefKey = giapRefKey;
	}

	public Date getGiapModDate() {
		return this.giapModDate;
	}

	public void setGiapModDate(Date giapModDate) {
		this.giapModDate = giapModDate;
	}

	public String getGiapModUserid() {
		return this.giapModUserid;
	}

	public void setGiapModUserid(String giapModUserid) {
		this.giapModUserid = giapModUserid;
	}

	public String getGiapUser1() {
		return this.giapUser1;
	}

	public void setGiapUser1(String giapUser1) {
		this.giapUser1 = giapUser1;
	}

	public String getGiapUser2() {
		return this.giapUser2;
	}

	public void setGiapUser2(String giapUser2) {
		this.giapUser2 = giapUser2;
	}

	public String getGiapQadc01() {
		return this.giapQadc01;
	}

	public void setGiapQadc01(String giapQadc01) {
		this.giapQadc01 = giapQadc01;
	}

	public String getGiapQadc02() {
		return this.giapQadc02;
	}

	public void setGiapQadc02(String giapQadc02) {
		this.giapQadc02 = giapQadc02;
	}

	public Double getOidGiapMstr() {
		return this.oidGiapMstr;
	}

	public void setOidGiapMstr(Double oidGiapMstr) {
		this.oidGiapMstr = oidGiapMstr;
	}

}