package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFlhMstr entity provides the base persistence definition of the
 * FlhMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFlhMstr implements java.io.Serializable {

	// Fields

	private FlhMstrId id;
	private String flhDesc;
	private String flhExec;
	private Integer flhX;
	private Integer flhY;
	private Integer flhDown;
	private String flhUser1;
	private String flhUser2;
	private String flhQadc01;
	private String flhModUserid;
	private Date flhModDate;
	private Double oidFlhMstr;

	// Constructors

	/** default constructor */
	public AbstractFlhMstr() {
	}

	/** minimal constructor */
	public AbstractFlhMstr(FlhMstrId id, String flhModUserid, Double oidFlhMstr) {
		this.id = id;
		this.flhModUserid = flhModUserid;
		this.oidFlhMstr = oidFlhMstr;
	}

	/** full constructor */
	public AbstractFlhMstr(FlhMstrId id, String flhDesc, String flhExec,
			Integer flhX, Integer flhY, Integer flhDown, String flhUser1,
			String flhUser2, String flhQadc01, String flhModUserid,
			Date flhModDate, Double oidFlhMstr) {
		this.id = id;
		this.flhDesc = flhDesc;
		this.flhExec = flhExec;
		this.flhX = flhX;
		this.flhY = flhY;
		this.flhDown = flhDown;
		this.flhUser1 = flhUser1;
		this.flhUser2 = flhUser2;
		this.flhQadc01 = flhQadc01;
		this.flhModUserid = flhModUserid;
		this.flhModDate = flhModDate;
		this.oidFlhMstr = oidFlhMstr;
	}

	// Property accessors

	public FlhMstrId getId() {
		return this.id;
	}

	public void setId(FlhMstrId id) {
		this.id = id;
	}

	public String getFlhDesc() {
		return this.flhDesc;
	}

	public void setFlhDesc(String flhDesc) {
		this.flhDesc = flhDesc;
	}

	public String getFlhExec() {
		return this.flhExec;
	}

	public void setFlhExec(String flhExec) {
		this.flhExec = flhExec;
	}

	public Integer getFlhX() {
		return this.flhX;
	}

	public void setFlhX(Integer flhX) {
		this.flhX = flhX;
	}

	public Integer getFlhY() {
		return this.flhY;
	}

	public void setFlhY(Integer flhY) {
		this.flhY = flhY;
	}

	public Integer getFlhDown() {
		return this.flhDown;
	}

	public void setFlhDown(Integer flhDown) {
		this.flhDown = flhDown;
	}

	public String getFlhUser1() {
		return this.flhUser1;
	}

	public void setFlhUser1(String flhUser1) {
		this.flhUser1 = flhUser1;
	}

	public String getFlhUser2() {
		return this.flhUser2;
	}

	public void setFlhUser2(String flhUser2) {
		this.flhUser2 = flhUser2;
	}

	public String getFlhQadc01() {
		return this.flhQadc01;
	}

	public void setFlhQadc01(String flhQadc01) {
		this.flhQadc01 = flhQadc01;
	}

	public String getFlhModUserid() {
		return this.flhModUserid;
	}

	public void setFlhModUserid(String flhModUserid) {
		this.flhModUserid = flhModUserid;
	}

	public Date getFlhModDate() {
		return this.flhModDate;
	}

	public void setFlhModDate(Date flhModDate) {
		this.flhModDate = flhModDate;
	}

	public Double getOidFlhMstr() {
		return this.oidFlhMstr;
	}

	public void setOidFlhMstr(Double oidFlhMstr) {
		this.oidFlhMstr = oidFlhMstr;
	}

}