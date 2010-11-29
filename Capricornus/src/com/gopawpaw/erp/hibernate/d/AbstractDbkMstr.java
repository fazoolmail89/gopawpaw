package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDbkMstr entity provides the base persistence definition of the
 * DbkMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDbkMstr implements java.io.Serializable {

	// Fields

	private DbkMstrId id;
	private String dbkDesc;
	private String dbkCurr;
	private Boolean dbkPost;
	private Boolean dbkYtd;
	private Integer dbkPdTaken;
	private Integer dbkCurrPd;
	private Integer dbkPdYr;
	private Boolean dbkRepCost;
	private Date dbkModDate;
	private String dbkUserid;
	private Date dbkBegDt;
	private Boolean dbkQad01;
	private String dbkQad02;
	private String dbkQad03;
	private String dbkBank;
	private String dbkUser1;
	private String dbkUser2;
	private Double oidDbkMstr;

	// Constructors

	/** default constructor */
	public AbstractDbkMstr() {
	}

	/** minimal constructor */
	public AbstractDbkMstr(DbkMstrId id, Integer dbkCurrPd, Integer dbkPdYr,
			Date dbkBegDt, Double oidDbkMstr) {
		this.id = id;
		this.dbkCurrPd = dbkCurrPd;
		this.dbkPdYr = dbkPdYr;
		this.dbkBegDt = dbkBegDt;
		this.oidDbkMstr = oidDbkMstr;
	}

	/** full constructor */
	public AbstractDbkMstr(DbkMstrId id, String dbkDesc, String dbkCurr,
			Boolean dbkPost, Boolean dbkYtd, Integer dbkPdTaken,
			Integer dbkCurrPd, Integer dbkPdYr, Boolean dbkRepCost,
			Date dbkModDate, String dbkUserid, Date dbkBegDt, Boolean dbkQad01,
			String dbkQad02, String dbkQad03, String dbkBank, String dbkUser1,
			String dbkUser2, Double oidDbkMstr) {
		this.id = id;
		this.dbkDesc = dbkDesc;
		this.dbkCurr = dbkCurr;
		this.dbkPost = dbkPost;
		this.dbkYtd = dbkYtd;
		this.dbkPdTaken = dbkPdTaken;
		this.dbkCurrPd = dbkCurrPd;
		this.dbkPdYr = dbkPdYr;
		this.dbkRepCost = dbkRepCost;
		this.dbkModDate = dbkModDate;
		this.dbkUserid = dbkUserid;
		this.dbkBegDt = dbkBegDt;
		this.dbkQad01 = dbkQad01;
		this.dbkQad02 = dbkQad02;
		this.dbkQad03 = dbkQad03;
		this.dbkBank = dbkBank;
		this.dbkUser1 = dbkUser1;
		this.dbkUser2 = dbkUser2;
		this.oidDbkMstr = oidDbkMstr;
	}

	// Property accessors

	public DbkMstrId getId() {
		return this.id;
	}

	public void setId(DbkMstrId id) {
		this.id = id;
	}

	public String getDbkDesc() {
		return this.dbkDesc;
	}

	public void setDbkDesc(String dbkDesc) {
		this.dbkDesc = dbkDesc;
	}

	public String getDbkCurr() {
		return this.dbkCurr;
	}

	public void setDbkCurr(String dbkCurr) {
		this.dbkCurr = dbkCurr;
	}

	public Boolean getDbkPost() {
		return this.dbkPost;
	}

	public void setDbkPost(Boolean dbkPost) {
		this.dbkPost = dbkPost;
	}

	public Boolean getDbkYtd() {
		return this.dbkYtd;
	}

	public void setDbkYtd(Boolean dbkYtd) {
		this.dbkYtd = dbkYtd;
	}

	public Integer getDbkPdTaken() {
		return this.dbkPdTaken;
	}

	public void setDbkPdTaken(Integer dbkPdTaken) {
		this.dbkPdTaken = dbkPdTaken;
	}

	public Integer getDbkCurrPd() {
		return this.dbkCurrPd;
	}

	public void setDbkCurrPd(Integer dbkCurrPd) {
		this.dbkCurrPd = dbkCurrPd;
	}

	public Integer getDbkPdYr() {
		return this.dbkPdYr;
	}

	public void setDbkPdYr(Integer dbkPdYr) {
		this.dbkPdYr = dbkPdYr;
	}

	public Boolean getDbkRepCost() {
		return this.dbkRepCost;
	}

	public void setDbkRepCost(Boolean dbkRepCost) {
		this.dbkRepCost = dbkRepCost;
	}

	public Date getDbkModDate() {
		return this.dbkModDate;
	}

	public void setDbkModDate(Date dbkModDate) {
		this.dbkModDate = dbkModDate;
	}

	public String getDbkUserid() {
		return this.dbkUserid;
	}

	public void setDbkUserid(String dbkUserid) {
		this.dbkUserid = dbkUserid;
	}

	public Date getDbkBegDt() {
		return this.dbkBegDt;
	}

	public void setDbkBegDt(Date dbkBegDt) {
		this.dbkBegDt = dbkBegDt;
	}

	public Boolean getDbkQad01() {
		return this.dbkQad01;
	}

	public void setDbkQad01(Boolean dbkQad01) {
		this.dbkQad01 = dbkQad01;
	}

	public String getDbkQad02() {
		return this.dbkQad02;
	}

	public void setDbkQad02(String dbkQad02) {
		this.dbkQad02 = dbkQad02;
	}

	public String getDbkQad03() {
		return this.dbkQad03;
	}

	public void setDbkQad03(String dbkQad03) {
		this.dbkQad03 = dbkQad03;
	}

	public String getDbkBank() {
		return this.dbkBank;
	}

	public void setDbkBank(String dbkBank) {
		this.dbkBank = dbkBank;
	}

	public String getDbkUser1() {
		return this.dbkUser1;
	}

	public void setDbkUser1(String dbkUser1) {
		this.dbkUser1 = dbkUser1;
	}

	public String getDbkUser2() {
		return this.dbkUser2;
	}

	public void setDbkUser2(String dbkUser2) {
		this.dbkUser2 = dbkUser2;
	}

	public Double getOidDbkMstr() {
		return this.oidDbkMstr;
	}

	public void setOidDbkMstr(Double oidDbkMstr) {
		this.oidDbkMstr = oidDbkMstr;
	}

}