package com.gopawpaw.erp.hibernate.i;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractIldDet entity provides the base persistence definition of the IldDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIldDet implements java.io.Serializable {

	// Fields

	private IldDetId id;
	private String ildSourceLoc;
	private BigDecimal ildRop;
	private BigDecimal ildSftyStk;
	private BigDecimal ildOrdMult;
	private Date ildModDate;
	private String ildUserid;
	private String ildUser1;
	private String ildUser2;
	private String ildQadc01;
	private Double oidIldDet;

	// Constructors

	/** default constructor */
	public AbstractIldDet() {
	}

	/** minimal constructor */
	public AbstractIldDet(IldDetId id, Double oidIldDet) {
		this.id = id;
		this.oidIldDet = oidIldDet;
	}

	/** full constructor */
	public AbstractIldDet(IldDetId id, String ildSourceLoc, BigDecimal ildRop,
			BigDecimal ildSftyStk, BigDecimal ildOrdMult, Date ildModDate,
			String ildUserid, String ildUser1, String ildUser2,
			String ildQadc01, Double oidIldDet) {
		this.id = id;
		this.ildSourceLoc = ildSourceLoc;
		this.ildRop = ildRop;
		this.ildSftyStk = ildSftyStk;
		this.ildOrdMult = ildOrdMult;
		this.ildModDate = ildModDate;
		this.ildUserid = ildUserid;
		this.ildUser1 = ildUser1;
		this.ildUser2 = ildUser2;
		this.ildQadc01 = ildQadc01;
		this.oidIldDet = oidIldDet;
	}

	// Property accessors

	public IldDetId getId() {
		return this.id;
	}

	public void setId(IldDetId id) {
		this.id = id;
	}

	public String getIldSourceLoc() {
		return this.ildSourceLoc;
	}

	public void setIldSourceLoc(String ildSourceLoc) {
		this.ildSourceLoc = ildSourceLoc;
	}

	public BigDecimal getIldRop() {
		return this.ildRop;
	}

	public void setIldRop(BigDecimal ildRop) {
		this.ildRop = ildRop;
	}

	public BigDecimal getIldSftyStk() {
		return this.ildSftyStk;
	}

	public void setIldSftyStk(BigDecimal ildSftyStk) {
		this.ildSftyStk = ildSftyStk;
	}

	public BigDecimal getIldOrdMult() {
		return this.ildOrdMult;
	}

	public void setIldOrdMult(BigDecimal ildOrdMult) {
		this.ildOrdMult = ildOrdMult;
	}

	public Date getIldModDate() {
		return this.ildModDate;
	}

	public void setIldModDate(Date ildModDate) {
		this.ildModDate = ildModDate;
	}

	public String getIldUserid() {
		return this.ildUserid;
	}

	public void setIldUserid(String ildUserid) {
		this.ildUserid = ildUserid;
	}

	public String getIldUser1() {
		return this.ildUser1;
	}

	public void setIldUser1(String ildUser1) {
		this.ildUser1 = ildUser1;
	}

	public String getIldUser2() {
		return this.ildUser2;
	}

	public void setIldUser2(String ildUser2) {
		this.ildUser2 = ildUser2;
	}

	public String getIldQadc01() {
		return this.ildQadc01;
	}

	public void setIldQadc01(String ildQadc01) {
		this.ildQadc01 = ildQadc01;
	}

	public Double getOidIldDet() {
		return this.oidIldDet;
	}

	public void setOidIldDet(Double oidIldDet) {
		this.oidIldDet = oidIldDet;
	}

}