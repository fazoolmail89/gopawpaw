package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLvrDet entity provides the base persistence definition of the LvrDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLvrDet implements java.io.Serializable {

	// Fields

	private Integer lvrNbr;
	private String lvrUserid;
	private String lvrDate;
	private String lvrTime;
	private String lvrUser1;
	private String lvrUser2;
	private String lvrQadc01;
	private Integer lvrQadi01;
	private Double lvrQadd01;
	private Boolean lvrQadl01;
	private Date lvrQadt01;
	private String lvrProduct;
	private Integer lvrMsgSev;
	private Integer lvrMsgNbr;
	private Integer lvrDirCnt;
	private Integer lvrIndCnt;
	private String lvrSid;
	private String lvrType;
	private Double oidLvrDet;

	// Constructors

	/** default constructor */
	public AbstractLvrDet() {
	}

	/** minimal constructor */
	public AbstractLvrDet(String lvrProduct, Integer lvrMsgSev,
			Integer lvrMsgNbr, Integer lvrDirCnt, Integer lvrIndCnt,
			String lvrSid, String lvrType, Double oidLvrDet) {
		this.lvrProduct = lvrProduct;
		this.lvrMsgSev = lvrMsgSev;
		this.lvrMsgNbr = lvrMsgNbr;
		this.lvrDirCnt = lvrDirCnt;
		this.lvrIndCnt = lvrIndCnt;
		this.lvrSid = lvrSid;
		this.lvrType = lvrType;
		this.oidLvrDet = oidLvrDet;
	}

	/** full constructor */
	public AbstractLvrDet(String lvrUserid, String lvrDate, String lvrTime,
			String lvrUser1, String lvrUser2, String lvrQadc01,
			Integer lvrQadi01, Double lvrQadd01, Boolean lvrQadl01,
			Date lvrQadt01, String lvrProduct, Integer lvrMsgSev,
			Integer lvrMsgNbr, Integer lvrDirCnt, Integer lvrIndCnt,
			String lvrSid, String lvrType, Double oidLvrDet) {
		this.lvrUserid = lvrUserid;
		this.lvrDate = lvrDate;
		this.lvrTime = lvrTime;
		this.lvrUser1 = lvrUser1;
		this.lvrUser2 = lvrUser2;
		this.lvrQadc01 = lvrQadc01;
		this.lvrQadi01 = lvrQadi01;
		this.lvrQadd01 = lvrQadd01;
		this.lvrQadl01 = lvrQadl01;
		this.lvrQadt01 = lvrQadt01;
		this.lvrProduct = lvrProduct;
		this.lvrMsgSev = lvrMsgSev;
		this.lvrMsgNbr = lvrMsgNbr;
		this.lvrDirCnt = lvrDirCnt;
		this.lvrIndCnt = lvrIndCnt;
		this.lvrSid = lvrSid;
		this.lvrType = lvrType;
		this.oidLvrDet = oidLvrDet;
	}

	// Property accessors

	public Integer getLvrNbr() {
		return this.lvrNbr;
	}

	public void setLvrNbr(Integer lvrNbr) {
		this.lvrNbr = lvrNbr;
	}

	public String getLvrUserid() {
		return this.lvrUserid;
	}

	public void setLvrUserid(String lvrUserid) {
		this.lvrUserid = lvrUserid;
	}

	public String getLvrDate() {
		return this.lvrDate;
	}

	public void setLvrDate(String lvrDate) {
		this.lvrDate = lvrDate;
	}

	public String getLvrTime() {
		return this.lvrTime;
	}

	public void setLvrTime(String lvrTime) {
		this.lvrTime = lvrTime;
	}

	public String getLvrUser1() {
		return this.lvrUser1;
	}

	public void setLvrUser1(String lvrUser1) {
		this.lvrUser1 = lvrUser1;
	}

	public String getLvrUser2() {
		return this.lvrUser2;
	}

	public void setLvrUser2(String lvrUser2) {
		this.lvrUser2 = lvrUser2;
	}

	public String getLvrQadc01() {
		return this.lvrQadc01;
	}

	public void setLvrQadc01(String lvrQadc01) {
		this.lvrQadc01 = lvrQadc01;
	}

	public Integer getLvrQadi01() {
		return this.lvrQadi01;
	}

	public void setLvrQadi01(Integer lvrQadi01) {
		this.lvrQadi01 = lvrQadi01;
	}

	public Double getLvrQadd01() {
		return this.lvrQadd01;
	}

	public void setLvrQadd01(Double lvrQadd01) {
		this.lvrQadd01 = lvrQadd01;
	}

	public Boolean getLvrQadl01() {
		return this.lvrQadl01;
	}

	public void setLvrQadl01(Boolean lvrQadl01) {
		this.lvrQadl01 = lvrQadl01;
	}

	public Date getLvrQadt01() {
		return this.lvrQadt01;
	}

	public void setLvrQadt01(Date lvrQadt01) {
		this.lvrQadt01 = lvrQadt01;
	}

	public String getLvrProduct() {
		return this.lvrProduct;
	}

	public void setLvrProduct(String lvrProduct) {
		this.lvrProduct = lvrProduct;
	}

	public Integer getLvrMsgSev() {
		return this.lvrMsgSev;
	}

	public void setLvrMsgSev(Integer lvrMsgSev) {
		this.lvrMsgSev = lvrMsgSev;
	}

	public Integer getLvrMsgNbr() {
		return this.lvrMsgNbr;
	}

	public void setLvrMsgNbr(Integer lvrMsgNbr) {
		this.lvrMsgNbr = lvrMsgNbr;
	}

	public Integer getLvrDirCnt() {
		return this.lvrDirCnt;
	}

	public void setLvrDirCnt(Integer lvrDirCnt) {
		this.lvrDirCnt = lvrDirCnt;
	}

	public Integer getLvrIndCnt() {
		return this.lvrIndCnt;
	}

	public void setLvrIndCnt(Integer lvrIndCnt) {
		this.lvrIndCnt = lvrIndCnt;
	}

	public String getLvrSid() {
		return this.lvrSid;
	}

	public void setLvrSid(String lvrSid) {
		this.lvrSid = lvrSid;
	}

	public String getLvrType() {
		return this.lvrType;
	}

	public void setLvrType(String lvrType) {
		this.lvrType = lvrType;
	}

	public Double getOidLvrDet() {
		return this.oidLvrDet;
	}

	public void setOidLvrDet(Double oidLvrDet) {
		this.oidLvrDet = oidLvrDet;
	}

}