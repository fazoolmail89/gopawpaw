package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLblcCtrl entity provides the base persistence definition of the
 * LblcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLblcCtrl implements java.io.Serializable {

	// Fields

	private Integer lblcIndex1;
	private Boolean lblcTransFrame;
	private String lblcModUserid;
	private Date lblcModDate;
	private String lblcUser1;
	private String lblcUser2;
	private String lblcQadc01;
	private String lblcQadc02;
	private Boolean lblcQadl01;
	private Boolean lblcQadl02;
	private Double oidLblcCtrl;

	// Constructors

	/** default constructor */
	public AbstractLblcCtrl() {
	}

	/** full constructor */
	public AbstractLblcCtrl(Boolean lblcTransFrame, String lblcModUserid,
			Date lblcModDate, String lblcUser1, String lblcUser2,
			String lblcQadc01, String lblcQadc02, Boolean lblcQadl01,
			Boolean lblcQadl02, Double oidLblcCtrl) {
		this.lblcTransFrame = lblcTransFrame;
		this.lblcModUserid = lblcModUserid;
		this.lblcModDate = lblcModDate;
		this.lblcUser1 = lblcUser1;
		this.lblcUser2 = lblcUser2;
		this.lblcQadc01 = lblcQadc01;
		this.lblcQadc02 = lblcQadc02;
		this.lblcQadl01 = lblcQadl01;
		this.lblcQadl02 = lblcQadl02;
		this.oidLblcCtrl = oidLblcCtrl;
	}

	// Property accessors

	public Integer getLblcIndex1() {
		return this.lblcIndex1;
	}

	public void setLblcIndex1(Integer lblcIndex1) {
		this.lblcIndex1 = lblcIndex1;
	}

	public Boolean getLblcTransFrame() {
		return this.lblcTransFrame;
	}

	public void setLblcTransFrame(Boolean lblcTransFrame) {
		this.lblcTransFrame = lblcTransFrame;
	}

	public String getLblcModUserid() {
		return this.lblcModUserid;
	}

	public void setLblcModUserid(String lblcModUserid) {
		this.lblcModUserid = lblcModUserid;
	}

	public Date getLblcModDate() {
		return this.lblcModDate;
	}

	public void setLblcModDate(Date lblcModDate) {
		this.lblcModDate = lblcModDate;
	}

	public String getLblcUser1() {
		return this.lblcUser1;
	}

	public void setLblcUser1(String lblcUser1) {
		this.lblcUser1 = lblcUser1;
	}

	public String getLblcUser2() {
		return this.lblcUser2;
	}

	public void setLblcUser2(String lblcUser2) {
		this.lblcUser2 = lblcUser2;
	}

	public String getLblcQadc01() {
		return this.lblcQadc01;
	}

	public void setLblcQadc01(String lblcQadc01) {
		this.lblcQadc01 = lblcQadc01;
	}

	public String getLblcQadc02() {
		return this.lblcQadc02;
	}

	public void setLblcQadc02(String lblcQadc02) {
		this.lblcQadc02 = lblcQadc02;
	}

	public Boolean getLblcQadl01() {
		return this.lblcQadl01;
	}

	public void setLblcQadl01(Boolean lblcQadl01) {
		this.lblcQadl01 = lblcQadl01;
	}

	public Boolean getLblcQadl02() {
		return this.lblcQadl02;
	}

	public void setLblcQadl02(Boolean lblcQadl02) {
		this.lblcQadl02 = lblcQadl02;
	}

	public Double getOidLblcCtrl() {
		return this.oidLblcCtrl;
	}

	public void setOidLblcCtrl(Double oidLblcCtrl) {
		this.oidLblcCtrl = oidLblcCtrl;
	}

}