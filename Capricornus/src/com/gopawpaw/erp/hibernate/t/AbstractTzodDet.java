package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTzodDet entity provides the base persistence definition of the
 * TzodDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTzodDet implements java.io.Serializable {

	// Fields

	private TzodDetId id;
	private Integer tzodMin;
	private Integer tzodHour;
	private Integer tzodSday;
	private Integer tzodEday;
	private Integer tzodMonth;
	private String tzodWday;
	private Integer tzodOffset;
	private String tzodDesc;
	private String tzodUser1;
	private String tzodUser2;
	private String tzodChr01;
	private String tzodChr02;
	private Integer tzodInt01;
	private Integer tzodInt02;
	private Date tzodDte01;
	private Date tzodDte02;
	private Boolean tzodLog01;
	private Boolean tzodLog02;
	private String tzodQadc01;
	private String tzodQadc02;
	private Integer tzodQadi01;
	private Integer tzodQadi02;
	private Boolean tzodQadl01;
	private Boolean tzodQadl02;
	private Date tzodQadt01;
	private Date tzodQadt02;
	private String tzodModUserid;
	private Date tzodModDate;
	private Double oidTzodDet;

	// Constructors

	/** default constructor */
	public AbstractTzodDet() {
	}

	/** minimal constructor */
	public AbstractTzodDet(TzodDetId id, Double oidTzodDet) {
		this.id = id;
		this.oidTzodDet = oidTzodDet;
	}

	/** full constructor */
	public AbstractTzodDet(TzodDetId id, Integer tzodMin, Integer tzodHour,
			Integer tzodSday, Integer tzodEday, Integer tzodMonth,
			String tzodWday, Integer tzodOffset, String tzodDesc,
			String tzodUser1, String tzodUser2, String tzodChr01,
			String tzodChr02, Integer tzodInt01, Integer tzodInt02,
			Date tzodDte01, Date tzodDte02, Boolean tzodLog01,
			Boolean tzodLog02, String tzodQadc01, String tzodQadc02,
			Integer tzodQadi01, Integer tzodQadi02, Boolean tzodQadl01,
			Boolean tzodQadl02, Date tzodQadt01, Date tzodQadt02,
			String tzodModUserid, Date tzodModDate, Double oidTzodDet) {
		this.id = id;
		this.tzodMin = tzodMin;
		this.tzodHour = tzodHour;
		this.tzodSday = tzodSday;
		this.tzodEday = tzodEday;
		this.tzodMonth = tzodMonth;
		this.tzodWday = tzodWday;
		this.tzodOffset = tzodOffset;
		this.tzodDesc = tzodDesc;
		this.tzodUser1 = tzodUser1;
		this.tzodUser2 = tzodUser2;
		this.tzodChr01 = tzodChr01;
		this.tzodChr02 = tzodChr02;
		this.tzodInt01 = tzodInt01;
		this.tzodInt02 = tzodInt02;
		this.tzodDte01 = tzodDte01;
		this.tzodDte02 = tzodDte02;
		this.tzodLog01 = tzodLog01;
		this.tzodLog02 = tzodLog02;
		this.tzodQadc01 = tzodQadc01;
		this.tzodQadc02 = tzodQadc02;
		this.tzodQadi01 = tzodQadi01;
		this.tzodQadi02 = tzodQadi02;
		this.tzodQadl01 = tzodQadl01;
		this.tzodQadl02 = tzodQadl02;
		this.tzodQadt01 = tzodQadt01;
		this.tzodQadt02 = tzodQadt02;
		this.tzodModUserid = tzodModUserid;
		this.tzodModDate = tzodModDate;
		this.oidTzodDet = oidTzodDet;
	}

	// Property accessors

	public TzodDetId getId() {
		return this.id;
	}

	public void setId(TzodDetId id) {
		this.id = id;
	}

	public Integer getTzodMin() {
		return this.tzodMin;
	}

	public void setTzodMin(Integer tzodMin) {
		this.tzodMin = tzodMin;
	}

	public Integer getTzodHour() {
		return this.tzodHour;
	}

	public void setTzodHour(Integer tzodHour) {
		this.tzodHour = tzodHour;
	}

	public Integer getTzodSday() {
		return this.tzodSday;
	}

	public void setTzodSday(Integer tzodSday) {
		this.tzodSday = tzodSday;
	}

	public Integer getTzodEday() {
		return this.tzodEday;
	}

	public void setTzodEday(Integer tzodEday) {
		this.tzodEday = tzodEday;
	}

	public Integer getTzodMonth() {
		return this.tzodMonth;
	}

	public void setTzodMonth(Integer tzodMonth) {
		this.tzodMonth = tzodMonth;
	}

	public String getTzodWday() {
		return this.tzodWday;
	}

	public void setTzodWday(String tzodWday) {
		this.tzodWday = tzodWday;
	}

	public Integer getTzodOffset() {
		return this.tzodOffset;
	}

	public void setTzodOffset(Integer tzodOffset) {
		this.tzodOffset = tzodOffset;
	}

	public String getTzodDesc() {
		return this.tzodDesc;
	}

	public void setTzodDesc(String tzodDesc) {
		this.tzodDesc = tzodDesc;
	}

	public String getTzodUser1() {
		return this.tzodUser1;
	}

	public void setTzodUser1(String tzodUser1) {
		this.tzodUser1 = tzodUser1;
	}

	public String getTzodUser2() {
		return this.tzodUser2;
	}

	public void setTzodUser2(String tzodUser2) {
		this.tzodUser2 = tzodUser2;
	}

	public String getTzodChr01() {
		return this.tzodChr01;
	}

	public void setTzodChr01(String tzodChr01) {
		this.tzodChr01 = tzodChr01;
	}

	public String getTzodChr02() {
		return this.tzodChr02;
	}

	public void setTzodChr02(String tzodChr02) {
		this.tzodChr02 = tzodChr02;
	}

	public Integer getTzodInt01() {
		return this.tzodInt01;
	}

	public void setTzodInt01(Integer tzodInt01) {
		this.tzodInt01 = tzodInt01;
	}

	public Integer getTzodInt02() {
		return this.tzodInt02;
	}

	public void setTzodInt02(Integer tzodInt02) {
		this.tzodInt02 = tzodInt02;
	}

	public Date getTzodDte01() {
		return this.tzodDte01;
	}

	public void setTzodDte01(Date tzodDte01) {
		this.tzodDte01 = tzodDte01;
	}

	public Date getTzodDte02() {
		return this.tzodDte02;
	}

	public void setTzodDte02(Date tzodDte02) {
		this.tzodDte02 = tzodDte02;
	}

	public Boolean getTzodLog01() {
		return this.tzodLog01;
	}

	public void setTzodLog01(Boolean tzodLog01) {
		this.tzodLog01 = tzodLog01;
	}

	public Boolean getTzodLog02() {
		return this.tzodLog02;
	}

	public void setTzodLog02(Boolean tzodLog02) {
		this.tzodLog02 = tzodLog02;
	}

	public String getTzodQadc01() {
		return this.tzodQadc01;
	}

	public void setTzodQadc01(String tzodQadc01) {
		this.tzodQadc01 = tzodQadc01;
	}

	public String getTzodQadc02() {
		return this.tzodQadc02;
	}

	public void setTzodQadc02(String tzodQadc02) {
		this.tzodQadc02 = tzodQadc02;
	}

	public Integer getTzodQadi01() {
		return this.tzodQadi01;
	}

	public void setTzodQadi01(Integer tzodQadi01) {
		this.tzodQadi01 = tzodQadi01;
	}

	public Integer getTzodQadi02() {
		return this.tzodQadi02;
	}

	public void setTzodQadi02(Integer tzodQadi02) {
		this.tzodQadi02 = tzodQadi02;
	}

	public Boolean getTzodQadl01() {
		return this.tzodQadl01;
	}

	public void setTzodQadl01(Boolean tzodQadl01) {
		this.tzodQadl01 = tzodQadl01;
	}

	public Boolean getTzodQadl02() {
		return this.tzodQadl02;
	}

	public void setTzodQadl02(Boolean tzodQadl02) {
		this.tzodQadl02 = tzodQadl02;
	}

	public Date getTzodQadt01() {
		return this.tzodQadt01;
	}

	public void setTzodQadt01(Date tzodQadt01) {
		this.tzodQadt01 = tzodQadt01;
	}

	public Date getTzodQadt02() {
		return this.tzodQadt02;
	}

	public void setTzodQadt02(Date tzodQadt02) {
		this.tzodQadt02 = tzodQadt02;
	}

	public String getTzodModUserid() {
		return this.tzodModUserid;
	}

	public void setTzodModUserid(String tzodModUserid) {
		this.tzodModUserid = tzodModUserid;
	}

	public Date getTzodModDate() {
		return this.tzodModDate;
	}

	public void setTzodModDate(Date tzodModDate) {
		this.tzodModDate = tzodModDate;
	}

	public Double getOidTzodDet() {
		return this.oidTzodDet;
	}

	public void setOidTzodDet(Double oidTzodDet) {
		this.oidTzodDet = oidTzodDet;
	}

}