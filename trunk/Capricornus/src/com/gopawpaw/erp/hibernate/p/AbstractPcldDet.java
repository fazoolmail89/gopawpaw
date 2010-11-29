package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPcldDet entity provides the base persistence definition of the
 * PcldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcldDet implements java.io.Serializable {

	// Fields

	private PcldDetId id;
	private String pcldDev;
	private Integer pcldCopies;
	private String pcldUser1;
	private String pcldUser2;
	private Date pcldExpire;
	private Date pcldModDate;
	private String pcldUserid;
	private String pcldQadc01;
	private Double oidPcldDet;

	// Constructors

	/** default constructor */
	public AbstractPcldDet() {
	}

	/** minimal constructor */
	public AbstractPcldDet(PcldDetId id, String pcldDev, Integer pcldCopies,
			String pcldUser1, String pcldUser2, String pcldUserid,
			Double oidPcldDet) {
		this.id = id;
		this.pcldDev = pcldDev;
		this.pcldCopies = pcldCopies;
		this.pcldUser1 = pcldUser1;
		this.pcldUser2 = pcldUser2;
		this.pcldUserid = pcldUserid;
		this.oidPcldDet = oidPcldDet;
	}

	/** full constructor */
	public AbstractPcldDet(PcldDetId id, String pcldDev, Integer pcldCopies,
			String pcldUser1, String pcldUser2, Date pcldExpire,
			Date pcldModDate, String pcldUserid, String pcldQadc01,
			Double oidPcldDet) {
		this.id = id;
		this.pcldDev = pcldDev;
		this.pcldCopies = pcldCopies;
		this.pcldUser1 = pcldUser1;
		this.pcldUser2 = pcldUser2;
		this.pcldExpire = pcldExpire;
		this.pcldModDate = pcldModDate;
		this.pcldUserid = pcldUserid;
		this.pcldQadc01 = pcldQadc01;
		this.oidPcldDet = oidPcldDet;
	}

	// Property accessors

	public PcldDetId getId() {
		return this.id;
	}

	public void setId(PcldDetId id) {
		this.id = id;
	}

	public String getPcldDev() {
		return this.pcldDev;
	}

	public void setPcldDev(String pcldDev) {
		this.pcldDev = pcldDev;
	}

	public Integer getPcldCopies() {
		return this.pcldCopies;
	}

	public void setPcldCopies(Integer pcldCopies) {
		this.pcldCopies = pcldCopies;
	}

	public String getPcldUser1() {
		return this.pcldUser1;
	}

	public void setPcldUser1(String pcldUser1) {
		this.pcldUser1 = pcldUser1;
	}

	public String getPcldUser2() {
		return this.pcldUser2;
	}

	public void setPcldUser2(String pcldUser2) {
		this.pcldUser2 = pcldUser2;
	}

	public Date getPcldExpire() {
		return this.pcldExpire;
	}

	public void setPcldExpire(Date pcldExpire) {
		this.pcldExpire = pcldExpire;
	}

	public Date getPcldModDate() {
		return this.pcldModDate;
	}

	public void setPcldModDate(Date pcldModDate) {
		this.pcldModDate = pcldModDate;
	}

	public String getPcldUserid() {
		return this.pcldUserid;
	}

	public void setPcldUserid(String pcldUserid) {
		this.pcldUserid = pcldUserid;
	}

	public String getPcldQadc01() {
		return this.pcldQadc01;
	}

	public void setPcldQadc01(String pcldQadc01) {
		this.pcldQadc01 = pcldQadc01;
	}

	public Double getOidPcldDet() {
		return this.oidPcldDet;
	}

	public void setOidPcldDet(Double oidPcldDet) {
		this.oidPcldDet = oidPcldDet;
	}

}