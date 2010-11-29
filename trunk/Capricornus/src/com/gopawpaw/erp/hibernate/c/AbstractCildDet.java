package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCildDet entity provides the base persistence definition of the
 * CildDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCildDet implements java.io.Serializable {

	// Fields

	private CildDetId id;
	private Date cildModDate;
	private String cildModUserid;
	private String cildPrevInv;
	private String cildPrevSoNbr;
	private String cildUser1;
	private String cildUser2;
	private String cildQadc01;
	private String cildQadc02;
	private Integer cildPrevLine;
	private Double oidCildDet;

	// Constructors

	/** default constructor */
	public AbstractCildDet() {
	}

	/** full constructor */
	public AbstractCildDet(CildDetId id, Date cildModDate,
			String cildModUserid, String cildPrevInv, String cildPrevSoNbr,
			String cildUser1, String cildUser2, String cildQadc01,
			String cildQadc02, Integer cildPrevLine, Double oidCildDet) {
		this.id = id;
		this.cildModDate = cildModDate;
		this.cildModUserid = cildModUserid;
		this.cildPrevInv = cildPrevInv;
		this.cildPrevSoNbr = cildPrevSoNbr;
		this.cildUser1 = cildUser1;
		this.cildUser2 = cildUser2;
		this.cildQadc01 = cildQadc01;
		this.cildQadc02 = cildQadc02;
		this.cildPrevLine = cildPrevLine;
		this.oidCildDet = oidCildDet;
	}

	// Property accessors

	public CildDetId getId() {
		return this.id;
	}

	public void setId(CildDetId id) {
		this.id = id;
	}

	public Date getCildModDate() {
		return this.cildModDate;
	}

	public void setCildModDate(Date cildModDate) {
		this.cildModDate = cildModDate;
	}

	public String getCildModUserid() {
		return this.cildModUserid;
	}

	public void setCildModUserid(String cildModUserid) {
		this.cildModUserid = cildModUserid;
	}

	public String getCildPrevInv() {
		return this.cildPrevInv;
	}

	public void setCildPrevInv(String cildPrevInv) {
		this.cildPrevInv = cildPrevInv;
	}

	public String getCildPrevSoNbr() {
		return this.cildPrevSoNbr;
	}

	public void setCildPrevSoNbr(String cildPrevSoNbr) {
		this.cildPrevSoNbr = cildPrevSoNbr;
	}

	public String getCildUser1() {
		return this.cildUser1;
	}

	public void setCildUser1(String cildUser1) {
		this.cildUser1 = cildUser1;
	}

	public String getCildUser2() {
		return this.cildUser2;
	}

	public void setCildUser2(String cildUser2) {
		this.cildUser2 = cildUser2;
	}

	public String getCildQadc01() {
		return this.cildQadc01;
	}

	public void setCildQadc01(String cildQadc01) {
		this.cildQadc01 = cildQadc01;
	}

	public String getCildQadc02() {
		return this.cildQadc02;
	}

	public void setCildQadc02(String cildQadc02) {
		this.cildQadc02 = cildQadc02;
	}

	public Integer getCildPrevLine() {
		return this.cildPrevLine;
	}

	public void setCildPrevLine(Integer cildPrevLine) {
		this.cildPrevLine = cildPrevLine;
	}

	public Double getOidCildDet() {
		return this.oidCildDet;
	}

	public void setOidCildDet(Double oidCildDet) {
		this.oidCildDet = oidCildDet;
	}

}