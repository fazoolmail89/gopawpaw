package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEucCtrl entity provides the base persistence definition of the
 * EucCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEucCtrl implements java.io.Serializable {

	// Fields

	private String eucDomain;
	private Integer eucNbr;
	private String eucUser1;
	private String eucUser2;
	private Integer eucQadi02;
	private String eucModUserid;
	private Date eucModDate;
	private String eucChr01;
	private Integer eucInt01;
	private Date eucDte01;
	private Boolean eucLog01;
	private String eucQadc01;
	private Integer eucQadi01;
	private Date eucQadt01;
	private Boolean eucQadl01;
	private Boolean eucCreateIsb;
	private Boolean eucQadl02;
	private Double oidEucCtrl;

	// Constructors

	/** default constructor */
	public AbstractEucCtrl() {
	}

	/** minimal constructor */
	public AbstractEucCtrl(Double oidEucCtrl) {
		this.oidEucCtrl = oidEucCtrl;
	}

	/** full constructor */
	public AbstractEucCtrl(Integer eucNbr, String eucUser1, String eucUser2,
			Integer eucQadi02, String eucModUserid, Date eucModDate,
			String eucChr01, Integer eucInt01, Date eucDte01, Boolean eucLog01,
			String eucQadc01, Integer eucQadi01, Date eucQadt01,
			Boolean eucQadl01, Boolean eucCreateIsb, Boolean eucQadl02,
			Double oidEucCtrl) {
		this.eucNbr = eucNbr;
		this.eucUser1 = eucUser1;
		this.eucUser2 = eucUser2;
		this.eucQadi02 = eucQadi02;
		this.eucModUserid = eucModUserid;
		this.eucModDate = eucModDate;
		this.eucChr01 = eucChr01;
		this.eucInt01 = eucInt01;
		this.eucDte01 = eucDte01;
		this.eucLog01 = eucLog01;
		this.eucQadc01 = eucQadc01;
		this.eucQadi01 = eucQadi01;
		this.eucQadt01 = eucQadt01;
		this.eucQadl01 = eucQadl01;
		this.eucCreateIsb = eucCreateIsb;
		this.eucQadl02 = eucQadl02;
		this.oidEucCtrl = oidEucCtrl;
	}

	// Property accessors

	public String getEucDomain() {
		return this.eucDomain;
	}

	public void setEucDomain(String eucDomain) {
		this.eucDomain = eucDomain;
	}

	public Integer getEucNbr() {
		return this.eucNbr;
	}

	public void setEucNbr(Integer eucNbr) {
		this.eucNbr = eucNbr;
	}

	public String getEucUser1() {
		return this.eucUser1;
	}

	public void setEucUser1(String eucUser1) {
		this.eucUser1 = eucUser1;
	}

	public String getEucUser2() {
		return this.eucUser2;
	}

	public void setEucUser2(String eucUser2) {
		this.eucUser2 = eucUser2;
	}

	public Integer getEucQadi02() {
		return this.eucQadi02;
	}

	public void setEucQadi02(Integer eucQadi02) {
		this.eucQadi02 = eucQadi02;
	}

	public String getEucModUserid() {
		return this.eucModUserid;
	}

	public void setEucModUserid(String eucModUserid) {
		this.eucModUserid = eucModUserid;
	}

	public Date getEucModDate() {
		return this.eucModDate;
	}

	public void setEucModDate(Date eucModDate) {
		this.eucModDate = eucModDate;
	}

	public String getEucChr01() {
		return this.eucChr01;
	}

	public void setEucChr01(String eucChr01) {
		this.eucChr01 = eucChr01;
	}

	public Integer getEucInt01() {
		return this.eucInt01;
	}

	public void setEucInt01(Integer eucInt01) {
		this.eucInt01 = eucInt01;
	}

	public Date getEucDte01() {
		return this.eucDte01;
	}

	public void setEucDte01(Date eucDte01) {
		this.eucDte01 = eucDte01;
	}

	public Boolean getEucLog01() {
		return this.eucLog01;
	}

	public void setEucLog01(Boolean eucLog01) {
		this.eucLog01 = eucLog01;
	}

	public String getEucQadc01() {
		return this.eucQadc01;
	}

	public void setEucQadc01(String eucQadc01) {
		this.eucQadc01 = eucQadc01;
	}

	public Integer getEucQadi01() {
		return this.eucQadi01;
	}

	public void setEucQadi01(Integer eucQadi01) {
		this.eucQadi01 = eucQadi01;
	}

	public Date getEucQadt01() {
		return this.eucQadt01;
	}

	public void setEucQadt01(Date eucQadt01) {
		this.eucQadt01 = eucQadt01;
	}

	public Boolean getEucQadl01() {
		return this.eucQadl01;
	}

	public void setEucQadl01(Boolean eucQadl01) {
		this.eucQadl01 = eucQadl01;
	}

	public Boolean getEucCreateIsb() {
		return this.eucCreateIsb;
	}

	public void setEucCreateIsb(Boolean eucCreateIsb) {
		this.eucCreateIsb = eucCreateIsb;
	}

	public Boolean getEucQadl02() {
		return this.eucQadl02;
	}

	public void setEucQadl02(Boolean eucQadl02) {
		this.eucQadl02 = eucQadl02;
	}

	public Double getOidEucCtrl() {
		return this.oidEucCtrl;
	}

	public void setOidEucCtrl(Double oidEucCtrl) {
		this.oidEucCtrl = oidEucCtrl;
	}

}