package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPshcCtrl entity provides the base persistence definition of the
 * PshcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPshcCtrl implements java.io.Serializable {

	// Fields

	private String pshcDomain;
	private String pshcShipperNrId;
	private String pshcMasterNrId;
	private Integer pshcQadi01;
	private Date pshcModDate;
	private String pshcModUserid;
	private String pshcUser1;
	private String pshcUser2;
	private String pshcQadc01;
	private String pshcQadc02;
	private Double oidPshcCtrl;

	// Constructors

	/** default constructor */
	public AbstractPshcCtrl() {
	}

	/** full constructor */
	public AbstractPshcCtrl(String pshcShipperNrId, String pshcMasterNrId,
			Integer pshcQadi01, Date pshcModDate, String pshcModUserid,
			String pshcUser1, String pshcUser2, String pshcQadc01,
			String pshcQadc02, Double oidPshcCtrl) {
		this.pshcShipperNrId = pshcShipperNrId;
		this.pshcMasterNrId = pshcMasterNrId;
		this.pshcQadi01 = pshcQadi01;
		this.pshcModDate = pshcModDate;
		this.pshcModUserid = pshcModUserid;
		this.pshcUser1 = pshcUser1;
		this.pshcUser2 = pshcUser2;
		this.pshcQadc01 = pshcQadc01;
		this.pshcQadc02 = pshcQadc02;
		this.oidPshcCtrl = oidPshcCtrl;
	}

	// Property accessors

	public String getPshcDomain() {
		return this.pshcDomain;
	}

	public void setPshcDomain(String pshcDomain) {
		this.pshcDomain = pshcDomain;
	}

	public String getPshcShipperNrId() {
		return this.pshcShipperNrId;
	}

	public void setPshcShipperNrId(String pshcShipperNrId) {
		this.pshcShipperNrId = pshcShipperNrId;
	}

	public String getPshcMasterNrId() {
		return this.pshcMasterNrId;
	}

	public void setPshcMasterNrId(String pshcMasterNrId) {
		this.pshcMasterNrId = pshcMasterNrId;
	}

	public Integer getPshcQadi01() {
		return this.pshcQadi01;
	}

	public void setPshcQadi01(Integer pshcQadi01) {
		this.pshcQadi01 = pshcQadi01;
	}

	public Date getPshcModDate() {
		return this.pshcModDate;
	}

	public void setPshcModDate(Date pshcModDate) {
		this.pshcModDate = pshcModDate;
	}

	public String getPshcModUserid() {
		return this.pshcModUserid;
	}

	public void setPshcModUserid(String pshcModUserid) {
		this.pshcModUserid = pshcModUserid;
	}

	public String getPshcUser1() {
		return this.pshcUser1;
	}

	public void setPshcUser1(String pshcUser1) {
		this.pshcUser1 = pshcUser1;
	}

	public String getPshcUser2() {
		return this.pshcUser2;
	}

	public void setPshcUser2(String pshcUser2) {
		this.pshcUser2 = pshcUser2;
	}

	public String getPshcQadc01() {
		return this.pshcQadc01;
	}

	public void setPshcQadc01(String pshcQadc01) {
		this.pshcQadc01 = pshcQadc01;
	}

	public String getPshcQadc02() {
		return this.pshcQadc02;
	}

	public void setPshcQadc02(String pshcQadc02) {
		this.pshcQadc02 = pshcQadc02;
	}

	public Double getOidPshcCtrl() {
		return this.oidPshcCtrl;
	}

	public void setOidPshcCtrl(Double oidPshcCtrl) {
		this.oidPshcCtrl = oidPshcCtrl;
	}

}