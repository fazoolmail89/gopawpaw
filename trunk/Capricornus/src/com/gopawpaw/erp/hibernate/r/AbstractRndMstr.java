package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRndMstr entity provides the base persistence definition of the
 * RndMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRndMstr implements java.io.Serializable {

	// Fields

	private RndMstrId id;
	private String rndDesc;
	private Double rndUnit;
	private Double rndThrshld;
	private String rndDecPt;
	private String rndQad01;
	private String rndQad02;
	private String rndQad03;
	private String rndQad04;
	private String rndChr01;
	private String rndChr02;
	private String rndChr03;
	private String rndChr04;
	private String rndUser1;
	private String rndUser2;
	private Double oidRndMstr;

	// Constructors

	/** default constructor */
	public AbstractRndMstr() {
	}

	/** minimal constructor */
	public AbstractRndMstr(RndMstrId id, Double oidRndMstr) {
		this.id = id;
		this.oidRndMstr = oidRndMstr;
	}

	/** full constructor */
	public AbstractRndMstr(RndMstrId id, String rndDesc, Double rndUnit,
			Double rndThrshld, String rndDecPt, String rndQad01,
			String rndQad02, String rndQad03, String rndQad04, String rndChr01,
			String rndChr02, String rndChr03, String rndChr04, String rndUser1,
			String rndUser2, Double oidRndMstr) {
		this.id = id;
		this.rndDesc = rndDesc;
		this.rndUnit = rndUnit;
		this.rndThrshld = rndThrshld;
		this.rndDecPt = rndDecPt;
		this.rndQad01 = rndQad01;
		this.rndQad02 = rndQad02;
		this.rndQad03 = rndQad03;
		this.rndQad04 = rndQad04;
		this.rndChr01 = rndChr01;
		this.rndChr02 = rndChr02;
		this.rndChr03 = rndChr03;
		this.rndChr04 = rndChr04;
		this.rndUser1 = rndUser1;
		this.rndUser2 = rndUser2;
		this.oidRndMstr = oidRndMstr;
	}

	// Property accessors

	public RndMstrId getId() {
		return this.id;
	}

	public void setId(RndMstrId id) {
		this.id = id;
	}

	public String getRndDesc() {
		return this.rndDesc;
	}

	public void setRndDesc(String rndDesc) {
		this.rndDesc = rndDesc;
	}

	public Double getRndUnit() {
		return this.rndUnit;
	}

	public void setRndUnit(Double rndUnit) {
		this.rndUnit = rndUnit;
	}

	public Double getRndThrshld() {
		return this.rndThrshld;
	}

	public void setRndThrshld(Double rndThrshld) {
		this.rndThrshld = rndThrshld;
	}

	public String getRndDecPt() {
		return this.rndDecPt;
	}

	public void setRndDecPt(String rndDecPt) {
		this.rndDecPt = rndDecPt;
	}

	public String getRndQad01() {
		return this.rndQad01;
	}

	public void setRndQad01(String rndQad01) {
		this.rndQad01 = rndQad01;
	}

	public String getRndQad02() {
		return this.rndQad02;
	}

	public void setRndQad02(String rndQad02) {
		this.rndQad02 = rndQad02;
	}

	public String getRndQad03() {
		return this.rndQad03;
	}

	public void setRndQad03(String rndQad03) {
		this.rndQad03 = rndQad03;
	}

	public String getRndQad04() {
		return this.rndQad04;
	}

	public void setRndQad04(String rndQad04) {
		this.rndQad04 = rndQad04;
	}

	public String getRndChr01() {
		return this.rndChr01;
	}

	public void setRndChr01(String rndChr01) {
		this.rndChr01 = rndChr01;
	}

	public String getRndChr02() {
		return this.rndChr02;
	}

	public void setRndChr02(String rndChr02) {
		this.rndChr02 = rndChr02;
	}

	public String getRndChr03() {
		return this.rndChr03;
	}

	public void setRndChr03(String rndChr03) {
		this.rndChr03 = rndChr03;
	}

	public String getRndChr04() {
		return this.rndChr04;
	}

	public void setRndChr04(String rndChr04) {
		this.rndChr04 = rndChr04;
	}

	public String getRndUser1() {
		return this.rndUser1;
	}

	public void setRndUser1(String rndUser1) {
		this.rndUser1 = rndUser1;
	}

	public String getRndUser2() {
		return this.rndUser2;
	}

	public void setRndUser2(String rndUser2) {
		this.rndUser2 = rndUser2;
	}

	public Double getOidRndMstr() {
		return this.oidRndMstr;
	}

	public void setOidRndMstr(Double oidRndMstr) {
		this.oidRndMstr = oidRndMstr;
	}

}