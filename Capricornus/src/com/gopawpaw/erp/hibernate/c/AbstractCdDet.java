package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCdDet entity provides the base persistence definition of the CdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCdDet implements java.io.Serializable {

	// Fields

	private CdDetId id;
	private String cdCmmt;
	private String cdUser1;
	private String cdUser2;
	private String cdQadc01;
	private Double oidCdDet;

	// Constructors

	/** default constructor */
	public AbstractCdDet() {
	}

	/** minimal constructor */
	public AbstractCdDet(CdDetId id, Double oidCdDet) {
		this.id = id;
		this.oidCdDet = oidCdDet;
	}

	/** full constructor */
	public AbstractCdDet(CdDetId id, String cdCmmt, String cdUser1,
			String cdUser2, String cdQadc01, Double oidCdDet) {
		this.id = id;
		this.cdCmmt = cdCmmt;
		this.cdUser1 = cdUser1;
		this.cdUser2 = cdUser2;
		this.cdQadc01 = cdQadc01;
		this.oidCdDet = oidCdDet;
	}

	// Property accessors

	public CdDetId getId() {
		return this.id;
	}

	public void setId(CdDetId id) {
		this.id = id;
	}

	public String getCdCmmt() {
		return this.cdCmmt;
	}

	public void setCdCmmt(String cdCmmt) {
		this.cdCmmt = cdCmmt;
	}

	public String getCdUser1() {
		return this.cdUser1;
	}

	public void setCdUser1(String cdUser1) {
		this.cdUser1 = cdUser1;
	}

	public String getCdUser2() {
		return this.cdUser2;
	}

	public void setCdUser2(String cdUser2) {
		this.cdUser2 = cdUser2;
	}

	public String getCdQadc01() {
		return this.cdQadc01;
	}

	public void setCdQadc01(String cdQadc01) {
		this.cdQadc01 = cdQadc01;
	}

	public Double getOidCdDet() {
		return this.oidCdDet;
	}

	public void setOidCdDet(Double oidCdDet) {
		this.oidCdDet = oidCdDet;
	}

}