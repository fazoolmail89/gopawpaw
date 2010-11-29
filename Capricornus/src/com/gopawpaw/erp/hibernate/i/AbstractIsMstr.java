package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractIsMstr entity provides the base persistence definition of the IsMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsMstr implements java.io.Serializable {

	// Fields

	private IsMstrId id;
	private Boolean isAvail;
	private Boolean isFrozen;
	private Boolean isOverissue;
	private String isUser1;
	private String isUser2;
	private String isUserid;
	private Date isModDate;
	private String isDesc;
	private Integer isCmtindx;
	private String isQadc01;
	private Double oidIsMstr;

	// Constructors

	/** default constructor */
	public AbstractIsMstr() {
	}

	/** minimal constructor */
	public AbstractIsMstr(IsMstrId id, Double oidIsMstr) {
		this.id = id;
		this.oidIsMstr = oidIsMstr;
	}

	/** full constructor */
	public AbstractIsMstr(IsMstrId id, Boolean isAvail, Boolean isFrozen,
			Boolean isOverissue, String isUser1, String isUser2,
			String isUserid, Date isModDate, String isDesc, Integer isCmtindx,
			String isQadc01, Double oidIsMstr) {
		this.id = id;
		this.isAvail = isAvail;
		this.isFrozen = isFrozen;
		this.isOverissue = isOverissue;
		this.isUser1 = isUser1;
		this.isUser2 = isUser2;
		this.isUserid = isUserid;
		this.isModDate = isModDate;
		this.isDesc = isDesc;
		this.isCmtindx = isCmtindx;
		this.isQadc01 = isQadc01;
		this.oidIsMstr = oidIsMstr;
	}

	// Property accessors

	public IsMstrId getId() {
		return this.id;
	}

	public void setId(IsMstrId id) {
		this.id = id;
	}

	public Boolean getIsAvail() {
		return this.isAvail;
	}

	public void setIsAvail(Boolean isAvail) {
		this.isAvail = isAvail;
	}

	public Boolean getIsFrozen() {
		return this.isFrozen;
	}

	public void setIsFrozen(Boolean isFrozen) {
		this.isFrozen = isFrozen;
	}

	public Boolean getIsOverissue() {
		return this.isOverissue;
	}

	public void setIsOverissue(Boolean isOverissue) {
		this.isOverissue = isOverissue;
	}

	public String getIsUser1() {
		return this.isUser1;
	}

	public void setIsUser1(String isUser1) {
		this.isUser1 = isUser1;
	}

	public String getIsUser2() {
		return this.isUser2;
	}

	public void setIsUser2(String isUser2) {
		this.isUser2 = isUser2;
	}

	public String getIsUserid() {
		return this.isUserid;
	}

	public void setIsUserid(String isUserid) {
		this.isUserid = isUserid;
	}

	public Date getIsModDate() {
		return this.isModDate;
	}

	public void setIsModDate(Date isModDate) {
		this.isModDate = isModDate;
	}

	public String getIsDesc() {
		return this.isDesc;
	}

	public void setIsDesc(String isDesc) {
		this.isDesc = isDesc;
	}

	public Integer getIsCmtindx() {
		return this.isCmtindx;
	}

	public void setIsCmtindx(Integer isCmtindx) {
		this.isCmtindx = isCmtindx;
	}

	public String getIsQadc01() {
		return this.isQadc01;
	}

	public void setIsQadc01(String isQadc01) {
		this.isQadc01 = isQadc01;
	}

	public Double getOidIsMstr() {
		return this.oidIsMstr;
	}

	public void setOidIsMstr(Double oidIsMstr) {
		this.oidIsMstr = oidIsMstr;
	}

}